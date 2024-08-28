public class Triangle {
    public static void main(String[] args) {
        int height = 7;
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i <= height; i++) {
            sb.setLength(0); // Clear the StringBuilder for each new row
            for (int j = 1; j <= height - i; j++) {
                sb.append(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                sb.append("T");
            }
            System.out.println(sb.toString());
        }
    }
}
