const WIDTH = 1920;
const HEIGHT = 1080;

function setup() {
    createCanvas(WIDTH, HEIGHT);
    background(64);
}

function draw() {
    fill(255);
    ellipse(mouseX, mouseY, 20, 20);
}