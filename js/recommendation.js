  
function recommend() 
{
  //pdf2text = "Matlab CSS, Lax Microsoft.  Visual Studio Amazon EC2 Xperf Git";
//    var json = require('mapping.json');
    var obj = jQuery.parseJSON('{"c++": ["c++"],"java": ["java"],"sql": ["database"],"html": ["networking"],"css": ["networking"],"javascript": ["networking"],"jquery": ["networking"],"php": ["networking"],"python": ["mathematical and computing", "testing"],"perl": ["mathematical and computing", "testing"],"c#": ["c++"],".net": ["networking"],"c": ["bit manipulation"],"objective-c": ["c++"],"ruby": ["networking"],"rails": ["networking"],"system": ["system design"],"design": ["system design"],"embedded": ["bit manipulation"],"machine": ["mathematical and computing"],"learning": ["mathematical and computing"],"data": ["mathematical and computing"],"analysis": ["mathematical and computing"],"network": ["networking"],"distributed": ["system design"],"front": ["networking"],"backend": ["networking"],"operating": ["system design"],"image": ["mathematical and computing"],"real-time": ["system design", "bit manipulation"],"parallel": ["mathematical and computing", "system design", "bit manipulation"],"database": ["database"],"speech": ["mathematical and computing"],"recognition": ["mathematical and computing"],"signal": ["mathematical and computing", "networking"],"web": ["networking"],"graphic": ["mathematical and computing"],"interface": ["networking", "system design"]}');
  // split text into words
  words = pdf2text.split(/[\s,]+/);
  
  // deduplicate
  var uniqueWords = [];
  uniqueWords = words.filter(function(element, pos) {
    return words.indexOf(element) == pos;
  })
//    console.log(uniqueWords);
  var classes = [];
  for (var i in uniqueWords) {
//      console.log(i);
    if (uniqueWords[i] in obj) {
        classes.push(obj[uniqueWords[i]]);
    }
  }
    var newArr = [];


    for(var i = 0; i < classes.length; i++)
    {
        newArr = newArr.concat(classes[i]);
    }

    var uniqueClasses = [];
    $.each(newArr, function(i, el){
        if($.inArray(el, uniqueClasses) === -1) uniqueClasses.push(el);
    });
    console.log(uniqueClasses);
}