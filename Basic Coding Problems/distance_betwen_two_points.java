public class distance_betwen_two_points {
    public static void main(String[] args){
        int x1 = 3;
        int x2 = 4;
        int y1 = 7;
        int y2 = 7;
        int distance = (int)Math.pow((Math.pow((x2-x1),2)+Math.pow((y2-y1),2)),0.5);
        System.out.println("The distance between the two points is : "+distance);
    }
}
