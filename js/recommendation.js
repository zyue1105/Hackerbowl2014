  
function recommend() 
{
  text = "Matlab CSS, Lax Microsoft.  Visual Studio Amazon EC2 Xperf Git";

  console.log(text);
  
  // split text into words
  words = text.split(/[.,\/ -]/);
  
  // deduplicate
  var uniqueWords = [];
  uniqueWords = words.filter(function(element, pos) {
    return words.indexOf(element) == pos;
  })
  
  for (var i in uiqueWords) {
    if (uniqueWords[i] in dict) {
      
    }
  }
}