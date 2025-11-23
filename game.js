function myFirstFunction(){
    let aString = "This function should be called once the button has been clicked";
    document.body.innerHTML += "<p>" + aString + "</p>";
}

function button(){
    const button = document.createElement("myButton");
    button.innertext = "Click This!";
    document.body.appendChild(button);

    button.addEventListener("click", () => {
        alert("button clicked!");
    });

}

button()



