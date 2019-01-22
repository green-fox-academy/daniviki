public class Colors {
    public static void main(String[] args) {

    String[][] colors =  new String[3][5];
        for (int r=0; r<colors.length; r++) {
            for (int c=0; c<colors[r].length; c++) {

                System.out.println(colors[r][c]);
            }
        }

    }
}
    // - Create a two dimensional array
//   which can contain the different shades of specified colors
// - In `colors[0]` store the shades of green:
//   `"lime", "forest green", "olive", "pale green", "spring green"`
// - In `colors[1]` store the shades of red:
//   `"orange red", "red", "tomato"`
// - In `colors[2]` store the shades of pink:
//   `"orchid", "violet", "pink", "hot pink"`