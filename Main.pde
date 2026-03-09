VirtualPet myPet;

PImage img1;
PImage img2;
Button feedButton;
Button playButton;
Button medicineButton;
Button cleanButton;

// How many milliseconds between each status update
// (increase to slow down, decrease to speed up)
final int UPDATE_INTERVAL = 10000;
int lastUpdateTime = 0;

// ---- Action message ----
String actionMessage = "";
int messageTime = 0;
final int MESSAGE_DURATION = 2000; // milliseconds to show the message

void setup() {
  size(600, 500);
  textFont(createFont("Arial", 16, true));
  img1 = loadImage("tamagotchi.jpg");
  img1.resize(275,0);
  img2 = loadImage("tamagotchipicture.png");
  img2.resize(145, 136);

  myPet = new VirtualPet("Coco");

  // Buttons sit along the bottom of the screen
  // Button(label, x, y, width, height)
  feedButton = new Button("Feed", 50, 430, 120, 45);
  playButton = new Button("Play", 180, 430, 120, 45);
  medicineButton = new Button("Medicine", 310, 430, 120, 45);
  cleanButton = new Button("Clean", 440, 430, 120, 45);
}

void draw() {
  background(255);

  // ---- Timed status update ----
  if (millis() - lastUpdateTime >= UPDATE_INTERVAL) {
    myPet.updateStatus();
    lastUpdateTime = millis();
  }

  // ---- Draw sections ----
  drawStats(myPet);
  feedButton.display();
  playButton.display();
  medicineButton.display();
  cleanButton.display();
  drawMessage();
  image(img1, 70, 25);
  image(img2, 134, 159);
}

void mousePressed() {
  if (feedButton.isClicked(mouseX, mouseY)) {
    Food f = new Food("Watermelon", 3, 2, 2);
    myPet.feed(f);
    showMessage(f.getName() + " eaten!");
  }

  if (playButton.isClicked(mouseX, mouseY)) {
    Game g = new Game("Coin Toss", 2, 1);
    myPet.play(g);
    showMessage(g.getName() + " played!");
  }

  if (medicineButton.isClicked(mouseX, mouseY)) {
    myPet.giveMedicine();
    showMessage("Medicine taken!");
  }
  
  if (cleanButton.isClicked(mouseX, mouseY)) {
    myPet.getClean();
    showMessage("Bath taken!");
  }
  
}

// Call this to set a new message
void showMessage(String msg) {
  actionMessage = msg;
  messageTime = millis();
}
