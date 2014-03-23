  
function recommend() 
{
  pdf2text = "Matlab CSS, Lax Microsoft.  Visual Studio Amazon EC2 Xperf Git";

  console.log(pdf2text);
  
  // split text into words
  words = pdf2text.split(/[.,\/ -]/);
  
  // deduplicate
  var uniqueWords = [];
  uniqueWords = words.filter(function(element, pos) {
    return words.indexOf(element) == pos;
  })
  
  for (var i in uniqueWords) {
    if (uniqueWords[i] in dict) {
      
    }
  }
}