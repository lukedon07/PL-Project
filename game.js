function myFirstFunction(){
    let aString = "This function should be called once the button has been clicked";
    document.body.innerHTML += "<p>" + aString + "</p>";
}

const button = document.createElement("myButton");
button.innertext = "Click This!";

button.addEventListener("click", myFirstFunction);
document.body.appendChild(button);
