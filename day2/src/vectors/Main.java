package vectors;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<AbstractVector2d> myList1 = new LinkedList<>();
        List<AbstractVector3d> myList2 = new LinkedList<>();

	    Vector2d a1 = new Vector2d(1, 2);
	    Vector2d b1 = new Vector2d(2, 4);

	    Vector3d a2 = new Vector3d(1, 2, 3);
	    Vector3d b2 = new Vector3d(3, 5, 6);
        System.out.println();
    }
}
