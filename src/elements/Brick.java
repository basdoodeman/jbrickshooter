package elements;

import basic.Oriented;
import values.BrickColor;
import values.Orientation;

/**
 * Class implements brick functionality.
 * 
 * @author X-Stranger
 */
@SuppressWarnings("serial")
public class Brick extends Oriented {

    /** Black brick. */
    public static final Brick BLACK = new Brick(); 
    
    /** Brick colors. */
    private BrickColor color;

    /** Brick parent collection. */
    private Oriented parentCollection = null;
    
    /**
     * Parameterized constructor.
     * 
     * @param color - brick color value
     */
    public Brick(BrickColor color) {
        super(color.getColor());
        this.color = color;
        this.setOrientation(Orientation.NONE);
    }
    
    /**
     * Default constructor.
     */
    public Brick() {
        this(BrickColor.BLACK);
    }
    
    /**
     * Parameterized constructor.
     * 
     * @param level - max color value
     */
    public Brick(int level) {
        this(BrickColor.generate(level));
    }
    
    /**
     * Sets new brick orientation.
     * 
     * @param orientation - new Orientation value
     */
    public void setOrientation(Orientation orientation) {
        super.setOrientation(orientation);
        this.setIcon(color.getColor(orientation));
    }

    /**
     * Getter for parent collection property.
     * 
     * @return Oriented object
     */
    public Oriented getParentCollection() {
        return this.parentCollection;
    }

    /**
     * Getter for brick color property.
     * 
     * @return BrickColor object
     */
    public final BrickColor getColor() {
        return this.color;
    }

    /**
     * Getter for parent collection property.
     * 
     * @param parentCollection - Oriented object
     */
    public void setParentCollection(Oriented parentCollection) {
        this.parentCollection = parentCollection;
    }
    
    /**
     * Returns true if brick has the same color with passed brick.
     * 
     * @param brick - brick to compare color to
     * @return boolean value
     */
    public boolean hasSameColor(Brick brick) {
        return (this.color.compareTo(brick.color));
    }

    /**
     * Returns true if brick has the same color with passed brick.
     * 
     * @param color - brick color to compare to
     * @return boolean value
     */
    public boolean hasSameColor(BrickColor color) {
        return (this.color.compareTo(color));
    }
}