function myFirstFunction() {
    let aString = "This function should be called once the button has been clicked";
    document.body.innerHTML += "<p>" + aString + "</p>";
}

function button() {
    const openButton = document.getElementById("openGameButton");
    const closeButton = document.getElementById("closeGameButton");
    const gameWindow = document.getElementById("gameWindow");

    openButton.innerText = "Click This To Play A Game!";

    document.body.appendChild(button);

    openButton.addEventListener("click", () => {
        gameWindow.style.display = "block";
        myFirstFunction();
    });

    closeButton.addEventListener("click", () => {
        gameWindow.style.display = "none";
    })
}

button();



