fetch("http://localhost:3000/api/content") //
  .then((response) => response.json())
  .then((data) => console.log(data));

//1. fetch the data from the url by call local host 3000 and get all content
//2. then convert the response to json
//3. then log the data to the console
