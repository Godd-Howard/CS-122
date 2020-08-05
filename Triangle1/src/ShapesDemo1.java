
public class ShapesDemo1 {

    public static void main(String[] args) {
        Isosceles1 sha = new Isosceles1(3, 4);
        Isosceles1 shap = new Isosceles1(sha);
        System.out.println(shap.getSideLength());
        System.out.println(shap.copy());
        System.out.println(shap.equals(sha));
        System.out.println(shap.getCircumRadius());
        System.out.println(shap.getPerimeter());
        System.out.println(shap);
        
        
        

    }

}
