const mouth = document.querySelector(".mouth")
const leftEye = document.querySelector(".eye1")
const righteye = document.querySelector(".eye2")
const switchbtn = document.querySelector(".switchbtn")
const tongue = document.querySelector(".tongue")
const allElements = [mouth, leftEye, righteye, switchbtn, tongue]
switchbtn.addEventListener("click", happyFace)

function happyFace() {
    allElements.forEach(element => {
        element.classList.toggle("happy")
    })
}