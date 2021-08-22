public class Rectangle {
    private Integer width;
    private Integer length;
    private String color;

    public Rectangle(Integer width, Integer length, String color) {
        this.width = width;
        this.length = length;
        this.color = color;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object obj) {
        //1. Reflexive: x.equals(x) == true , an object must equal to itself.
        if (obj == this) {
            return true;
        }
        //2. For any non-null object x, x.equals(null)==false
        if (obj == null) {
            return false;
        }
        //3. Symmetry: if(x.equals(y)==true) then y.equals(x) == true.
        //4. Transitive: if x.equals(y) and y.equals(z); then x.equals(z)
        //5. Consistent: if x.equals(y)==true and no value is modified,
        // then it’s always true for every call
        if (this.getClass().equals(obj.getClass())) {
            Rectangle rectangle = (Rectangle) obj;
            return (width == rectangle.width
                    || (width != null && width.equals(rectangle.width)))
                    && (length == rectangle.length
                    || (length != null && length.equals(rectangle.length)))
                    && (color == rectangle.color
                    || (color != null && color.equals(rectangle.color)));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (width == null ? 0 : width.hashCode());
        result = 31 * result + (length == null ? 0 : length.hashCode());
        result = 31 * result + (color == null ? 0 : color.hashCode());
        return result;
    }
}
