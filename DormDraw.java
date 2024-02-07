import processing.core.PImage;
import java.io.File;

public class DormDraw {
    private static PImage backgroundImage;
    // PImage object that represents the
    // background image
    private static Symbol[] symbols;

    // non-compact perfect size array storing
    // dorm symbols added to the display window
    public static void setup() {
        Utility.background(Utility.color(255, 250, 250));
        // set the background image
        backgroundImage = Utility.loadImage("images" +
                File.separator + "background.png");
        Symbol[] symbol = {null, null, null, null, null, null,
                null, null, null, null, null, null};
        symbols = new Symbol[12];
        symbols[0] = new Symbol("bed.png", 200, 300);
        symbols[1] = new Symbol("sofa.png", 700, 300);
        symbols[4] = new Symbol("dresser.png", 100, 100);
        symbols[9] = new Symbol("plant.png", 100, 500);
    }
    public static void draw() {
        // Draw the background image at the center of the screen
        Utility.image(backgroundImage, Utility.width() / 2, Utility.height() / 2);
        for (int i = 0; i < symbols.length; i++) {
            Symbol symbol = symbols[i];
            if (symbol != null) {
                symbol.draw();
            }

        }
    }
    public static void addSymbol(Symbol[] symbols, Symbol toAdd) {
        // Adds a new Symbol (toAdd) to the perfect size array symbols.
        // The toAdd Symbol must be added to the first null position in the array.
        // If the array is full, the method does nothing.
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] == null) {
                symbols[i] = toAdd;
                return;
            }
        }
    }
    public static void keyPressed() {
        char key = Utility.key();
        for (int i = 0; i < symbols.length; i++) {
            Symbol symbol = symbols[i];
            if (symbol != null) {
                switch (key) {
                    case 'b':
                        Symbol bed = new Symbol("bed.png", Utility.mouseX(), Utility.mouseY());
                        bed.draw();
                        addSymbol(symbols,bed);
                        break;
                    case 'B':
                        Symbol capitalBed = new Symbol("bed.png", Utility.mouseX(), Utility.mouseY());
                        capitalBed.draw();
                        addSymbol(symbols,capitalBed);
                        break;
                    case 'c':
                        Symbol chair = new Symbol("chair.png", Utility.mouseX(), Utility.mouseY());
                        chair.draw();
                        addSymbol(symbols,chair);
                        break;
                    case 'C':
                        Symbol capitalChair = new Symbol("chair.png", Utility.mouseX(), Utility.mouseY());
                        capitalChair.draw();
                        addSymbol(symbols,capitalChair);;
                        break;
                    case 'd':
                        Symbol dresser = new Symbol("dresser.png", Utility.mouseX(), Utility.mouseY());
                        dresser.draw();
                        addSymbol(symbols,dresser);
                        break;
                    case 'D':
                        Symbol capitalDresser = new Symbol("dresser.png", Utility.mouseX(), Utility.mouseY());
                        capitalDresser.draw();
                        addSymbol(symbols,capitalDresser);
                        break;
                    case 'k':
                        Symbol desk = new Symbol("desk.png", Utility.mouseX(), Utility.mouseY());
                        desk.draw();
                        addSymbol(symbols,desk);
                        break;
                    case 'K':
                        Symbol capitalDesk = new Symbol("desk.png", Utility.mouseX(), Utility.mouseY());
                        capitalDesk.draw();
                        addSymbol(symbols,capitalDesk);
                        break;
                    case 'f':
                        Symbol sofa = new Symbol("sofa.png", Utility.mouseX(), Utility.mouseY());
                        sofa.draw();
                        addSymbol(symbols,sofa);
                        break;
                    case 'F':
                        Symbol capitalSofa = new Symbol("sofa.png", Utility.mouseX(), Utility.mouseY());
                        capitalSofa.draw();
                        addSymbol(symbols,capitalSofa);
                        break;
                    case 'g':
                        Symbol rug = new Symbol("rug.png", Utility.mouseX(), Utility.mouseY());
                        rug.draw();
                        addSymbol(symbols,rug);
                        break;
                    case 'G':
                        Symbol capitalRug = new Symbol("rug.png", Utility.mouseX(), Utility.mouseY());
                        capitalRug.draw();
                        addSymbol(symbols,capitalRug);
                        break;
                    case 'p':
                        Symbol plant = new Symbol("plant.png", Utility.mouseX(), Utility.mouseY());
                        plant.draw();
                        addSymbol(symbols,plant);
                        break;
                    case 'P':
                        Symbol capitalPlant = new Symbol("plant.png", Utility.mouseX(), Utility.mouseY());
                        capitalPlant.draw();
                        addSymbol(symbols,capitalPlant);
                        break;
                }
            }
        }
    }

    // This method returns true if the method is over the input symbol
    public static boolean isMouseOver(Symbol symbol) {
        for (int i = 0; i < symbols.length; i++) {
            if (symbol != null) {
                int symbolX = symbol.width() / 2;
                int symbolY = symbol.height() / 2;
                int symbolWidth = symbol.width();
                int symbolHeight = symbol.height();
                if (Utility.mouseX() >= symbolX && Utility.mouseX() <= symbolX + symbolWidth &&
                        Utility.mouseY() >= symbolY && Utility.mouseY() <= symbolY + symbolHeight) {
                    return true;
                }
            }
        }
        return false;
    }


    /**
     * Callback method called each time the user presses the mouse
     */
    public static void mousePressed() {
        for (int i = 0; i < symbols.length; i++) {
            Symbol symbol = symbols[i];
            if (symbol != null && DormDraw.isMouseOver(symbol)) {
            
            }

        }

    }
    /**
     * Callback method called each time the mouse is released
     */
    public static void mouseReleased() {


    }


    public static void main(String[] args) {
        Utility.runApplication(); // starts the application

    }
}