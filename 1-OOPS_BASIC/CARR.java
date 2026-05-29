abstract class CARR{
    public abstract void car();

     public static void main(String[] args) {
        CARR porobj = new Porsche();
        CARR toyobj = new Toyota();
        CARR ferobj = new Ferrari();

        porobj.car();
        toyobj.car();
        ferobj.car();

     }}
    class Porsche extends CARR{
        @Override
        public void car(){
            System.out.println("THIS CAR IS FAST");
        }}
    class Toyota extends CARR{
        @Override
        public void car(){
            
            System.out.println("This car is slow");
                    }
    }
    class Ferrari extends CARR{
        @Override
        public void car(){
            System.out.println("MAX VERSTAPEN ");
        }
    }

    
