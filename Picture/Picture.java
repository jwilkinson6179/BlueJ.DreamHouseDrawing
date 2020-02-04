
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 *
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Triangle roof;
    private Square doorBottom;
    private Square doorTop;
    private Circle windowDoor;
    private Square window;
    private Square garage;
    private Square garageDoor;
    private Triangle garageRoof;
    private Square trunk;
    private Triangle leaves;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveVertical(60);
        wall.changeSize(120);
        wall.makeVisible();

        roof = new Triangle();
        roof.moveVertical(55);
        roof.moveHorizontal(70);
        roof.changeSize(45, 130);
        roof.changeColor("black");
        roof.makeVisible();

        doorTop = new Square();
        doorTop.moveVertical(150);
        doorTop.moveHorizontal(20);
        doorTop.changeColor("yellow");
        doorTop.makeVisible();

        doorBottom = new Square();
        doorBottom.moveVertical(120);
        doorBottom.moveHorizontal(20);
        doorBottom.changeColor("yellow");
        doorBottom.makeVisible();

        windowDoor = new Circle();
        windowDoor.moveVertical(115);
        windowDoor.moveHorizontal(60);
        windowDoor.makeVisible();

        window = new Square();
        window.changeColor("blue");
        window.moveVertical(100);
        window.moveHorizontal(60);
        window.makeVisible();

        garage = new Square();
        garage.moveVertical(95);
        garage.moveHorizontal(120);
        garage.changeSize(85);
        garage.makeVisible();

        garageRoof = new Triangle();
        garageRoof.changeColor("black");
        garageRoof.changeSize(30, 95);
        garageRoof.moveVertical(100);
        garageRoof.moveHorizontal(170);
        garageRoof.makeVisible();

        garageDoor = new Square();
        garageDoor.changeColor("yellow");
        garageDoor.changeSize(60);
        garageDoor.moveVertical(120);
        garageDoor.moveHorizontal(130);
        garageDoor.makeVisible();

        trunk = new Square();
        trunk.changeSize(15);
        trunk.changeColor("magenta");
        trunk.moveHorizontal(80);
        trunk.moveVertical(165);
        trunk.makeVisible();

        leaves = new Triangle();
        leaves.changeSize(90, 25);
        leaves.moveHorizontal(98);
        leaves.moveVertical(110);
        leaves.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
        }
    }

}
