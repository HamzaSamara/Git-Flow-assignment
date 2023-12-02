public class Rectangle {
        private int height;
        private int width;

        public Rectangle(int height,int width){
            System.out.println("Constructor From Rectangle Class!");
            this.height = height;
            this.width = width;

        }

        public int getHeight() {
            return height;
        }

        public int getWidth(){
            return width;
        }

        public double Area(){

                return height * width;
        }

        public double Perimeter() {
            return  (height + width);
        }





}
