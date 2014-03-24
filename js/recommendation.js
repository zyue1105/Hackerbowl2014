  
var jsonData;
var uniqueClasses = [];
  
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
  
  $.each(newArr, function(i, el){
      if($.inArray(el, uniqueClasses) === -1) uniqueClasses.push(el);
  });
  console.log(uniqueClasses);
  
  console.log(jsonData);    
  
  var companyData;
  for (var i in jsonData.children) {
    if (jsonData.children[i].name == 'amazon') {
      companyData = jsonData.children[i];
      break;
    }
  }
   
  var result = recommendData(companyData);
  
  console.log(result);
  // show result
    
}

function recommendData(treeData)
{
  console.log(treeData);    
  
  var res = {};
  res['name'] = treeData.name;
  res['size'] = treeData.size;
  res['children'] = [];    
  
  // reach the leaf
  if ($.inArray(treeData.name, uniqueClasses) != -1) {    
    for (var i = 0; i < treeData.children.length && i < 5; ++i) {
      var leaf = {};
      var node = treeData.children[i];
      leaf['title'] = node.title;
      leaf['size'] = node.size;
      leaf['location'] = node.location;
      leaf['name'] = node.name;
      leaf['votes'] = node.votes;
      res['children'].push(leaf);
    }
    if (res['children'].length)
      return res;
    return null;
  }     

  if (!treeData.children)
    return;
  
  for (var i in treeData.children) {        
      var child = recommendData(treeData.children[i]);
      if (child != null)
        res['children'].push(child);
  }
  if (res['children'].length)
    return res;
  return null;
  
}