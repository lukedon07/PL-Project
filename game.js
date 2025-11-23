function createGame() {
    let aString = "This function should be called once the button has been clicked";
    document.body.innerHTML += "<p>" + aString + "</p>";
}

function initializeButtons() {
    const openButton = document.getElementById("openGameButton");
    const closeButton = document.getElementById("closeGameButton");
    const gameWindow = document.getElementById("gameWindow");

    openButton.innerText = "Click This To Play A Game!";

    openButton.addEventListener("click", () => {
        gameWindow.style.display = "block";
        createGame();
    });

    closeButton.addEventListener("click", () => {
        gameWindow.style.display = "none";
    })
}

document.addEventListener("DOMContentLoaded", initializeButtons);



