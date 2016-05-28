/*
created with obj2opengl.pl

source file    : /home/amil101/obj2opengl/cube.obj
vertices       : 8
faces          : 12
normals        : 6
texture coords : 0


// include generated arrays
#import "/home/amil101/obj2opengl/cube.java"

// set input data to arrays
glVertexPointer(3, GL_FLOAT, 0, cubeVerts);
glNormalPointer(GL_FLOAT, 0, cubeNormals);

// draw data
glDrawArrays(GL_TRIANGLES, 0, cubeNumVerts);
*/

public class cube { 
  public static final int cubeNumVerts = 36;

  public static final float cubeVerts [] = {
    // f  1//2  7//2  5//2
    -0.5f, -0.5f, -0.5f,
    0.5f, 0.5f, -0.5f,
    0.5f, -0.5f, -0.5f,
    // f  1//2  3//2  7//2 
    -0.5f, -0.5f, -0.5f,
    -0.5f, 0.5f, -0.5f,
    0.5f, 0.5f, -0.5f,
    // f  1//6  4//6  3//6 
    -0.5f, -0.5f, -0.5f,
    -0.5f, 0.5f, 0.5f,
    -0.5f, 0.5f, -0.5f,
    // f  1//6  2//6  4//6 
    -0.5f, -0.5f, -0.5f,
    -0.5f, -0.5f, 0.5f,
    -0.5f, 0.5f, 0.5f,
    // f  3//3  8//3  7//3 
    -0.5f, 0.5f, -0.5f,
    0.5f, 0.5f, 0.5f,
    0.5f, 0.5f, -0.5f,
    // f  3//3  4//3  8//3 
    -0.5f, 0.5f, -0.5f,
    -0.5f, 0.5f, 0.5f,
    0.5f, 0.5f, 0.5f,
    // f  5//5  7//5  8//5 
    0.5f, -0.5f, -0.5f,
    0.5f, 0.5f, -0.5f,
    0.5f, 0.5f, 0.5f,
    // f  5//5  8//5  6//5 
    0.5f, -0.5f, -0.5f,
    0.5f, 0.5f, 0.5f,
    0.5f, -0.5f, 0.5f,
    // f  1//4  5//4  6//4 
    -0.5f, -0.5f, -0.5f,
    0.5f, -0.5f, -0.5f,
    0.5f, -0.5f, 0.5f,
    // f  1//4  6//4  2//4 
    -0.5f, -0.5f, -0.5f,
    0.5f, -0.5f, 0.5f,
    -0.5f, -0.5f, 0.5f,
    // f  2//1  6//1  8//1 
    -0.5f, -0.5f, 0.5f,
    0.5f, -0.5f, 0.5f,
    0.5f, 0.5f, 0.5f,
    // f  2//1  8//1  4//1 
    -0.5f, -0.5f, 0.5f,
    0.5f, 0.5f, 0.5f,
    -0.5f, 0.5f, 0.5f,
  };

  public static final float cubeNormals [] = {
    // f  1//2  7//2  5//2
    0f, 0f, -1f,
    0f, 0f, -1f,
    0f, 0f, -1f,
    // f  1//2  3//2  7//2 
    0f, 0f, -1f,
    0f, 0f, -1f,
    0f, 0f, -1f,
    // f  1//6  4//6  3//6 
    -1f, 0f, 0f,
    -1f, 0f, 0f,
    -1f, 0f, 0f,
    // f  1//6  2//6  4//6 
    -1f, 0f, 0f,
    -1f, 0f, 0f,
    -1f, 0f, 0f,
    // f  3//3  8//3  7//3 
    0f, 1f, 0f,
    0f, 1f, 0f,
    0f, 1f, 0f,
    // f  3//3  4//3  8//3 
    0f, 1f, 0f,
    0f, 1f, 0f,
    0f, 1f, 0f,
    // f  5//5  7//5  8//5 
    1f, 0f, 0f,
    1f, 0f, 0f,
    1f, 0f, 0f,
    // f  5//5  8//5  6//5 
    1f, 0f, 0f,
    1f, 0f, 0f,
    1f, 0f, 0f,
    // f  1//4  5//4  6//4 
    0f, -1f, 0f,
    0f, -1f, 0f,
    0f, -1f, 0f,
    // f  1//4  6//4  2//4 
    0f, -1f, 0f,
    0f, -1f, 0f,
    0f, -1f, 0f,
    // f  2//1  6//1  8//1 
    0f, 0f, 1f,
    0f, 0f, 1f,
    0f, 0f, 1f,
    // f  2//1  8//1  4//1 
    0f, 0f, 1f,
    0f, 0f, 1f,
    0f, 0f, 1f,
  };

}