public class Rectangle {
    int width;
    int height;


    Rectangle(int w, int h) {
        setWidth(w);
        setHeight(h);
    }

    Rectangle(int w) {
        if (w < 0) {
            w *= -1;
        }
        width = w;
        height = w;

    }


    Rectangle() {
        width = 10;
        height = 20;
    }

    int masahat() {
        return width * height;
    }

    void setWidth(int width) {
        if(width < 0) {
            width *= -1;
        }
        this.width = width;

    }

    void setHeight(int h) {
        if (h < 0) {
            h *= -1;
        }
        height = h;
    }

    int getWidth() {
        return width;
    }

    int getHeight() {
        return height;
    }

}
