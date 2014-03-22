var SEMANTIC_SERVICE_URL = "http://localhost:8080/BigSemanticsService/";
var results = [];

function setup()
{
  console.log("Begin to crawl...");
    
  //var url = "http://www.careercup.com/page?pid=amazon-interview-questions&topic=arrays-interview-questions&sort=comments";
  //var url = "http://www.careercup.com/page?pid=amazon-interview-questions&topic=trees-and-graphs-interview-questions&sort=comments";
  var url = "http://www.careercup.com/page?pid=amazon-interview-questions&topic=system-design-interview-questions&sort=comments";
  
  getMetadata(url, "getDetail");
}

/**
 * Retrieves the meta-metadata from the service using a JSON-p call.
 * When the service responds the callback function will be called.
 * @param url, url of the target meta-metadata
 * @param callback, name of the function to be called from the JSON-p call
 */
function getMetadata(url, callback)
{
	// get metadata by Bigsementics
	var serviceURL = SEMANTIC_SERVICE_URL + "metadata.jsonp?callback=" + callback + "&url=" + encodeURIComponent(url);
	doJSONPCall(serviceURL);
	console.log("requesting semantics service for metadata: " + serviceURL);
}

/**
 * Do a JSON-P call by appending the jsonP url as a scrip object.
 * @param jsonpURL 
 */
function doJSONPCall(jsonpURL)
{
	var script = document.createElement('script');
	script.src = jsonpURL;
	document.head.appendChild(script);
}

function getDetail(questionListMetadata)
{
  console.log("Begin to get detailed data...");
  console.log(questionListMetadata);   
	
  var interview_questions = questionListMetadata.question_list.interview_questions;
	for (var i in interview_questions) {			    
    getMetadata(interview_questions[i].location, "getFullMetadata");		
	}
}

function getFullMetadata(questionMetadata)
{
  console.log(questionMetadata);  
  results.push(questionMetadata);  
}