
PDFJS.workerSrc = document.getElementById("pdf-js").getAttribute("src");
var pdf2text;

function convertDataURIToBinary(dataURI) {
  var BASE64_MARKER = ';base64,';

  var base64Index = dataURI.indexOf(BASE64_MARKER) + BASE64_MARKER.length;
  var base64 = dataURI.substring(base64Index);
  var raw = window.atob(base64);
  var rawLength = raw.length;
  var array = new Uint8Array(new ArrayBuffer(rawLength));    

  for(i = 0; i < rawLength; i++) {
    array[i] = raw.charCodeAt(i);
  }
  return array;
}

function onFileLoad(e) { 
  console.log(e.target.result);       
  
  // convert the base64 string to a Uint8Array.
  var pdfAsArray = convertDataURIToBinary(e.target.result);  
  var pdf = new PDFJS.PDFDoc(pdfAsArray);
  
  var div = document.getElementById('viewer');      
  var total = pdf.numPages;
  var complete = 0;
  
  for (i = 1; i <= total; i++){
    var page = pdf.getPage(i);

    var canvas = document.createElement('canvas');
    canvas.id = 'page' + i;
    canvas.mozOpaque = true;
    div.appendChild(canvas);

    canvas.width = page.width;
    canvas.height = page.height;

    var context = canvas.getContext('2d');
    context.save();
    context.fillStyle = 'rgb(255, 255, 255)';
    context.fillRect(0, 0, canvas.width, canvas.height);
    context.restore();       
    
    var textLayer = document.createElement('div');
    textLayer.className = 'textLayer';
    document.body.appendChild(textLayer);
    
    page.startRendering(context, function(){
      if (++complete == total){
                    
        window.setTimeout(function(){
          var layers = [];
          var nodes = document.querySelectorAll(".textLayer > div");
          for (var j = 0; j < nodes.length; j++){
            layers.push(nodes[j].textContent + "\n");
          }
          pdf2text = layers.join("\n");
                        
        }, 1000);
      }
    }, textLayer);
  }
}

function displayPreview(files) {
  var reader = new FileReader();
  reader.onload = onFileLoad;
  reader.readAsDataURL(files[0]);
}
