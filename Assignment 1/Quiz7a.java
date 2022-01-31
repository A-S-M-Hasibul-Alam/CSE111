public class Quiz7a{
public static void main(String [] args){
int i = 0;
int j = 1;
String [ ][ ] twoD1 = new String [3][3];
int [ ][ ] twoD2 = new int [3][3];
twoD1[0][0] = "x";
twoD1[0][1] = "c";
twoD1[0][2] = "f";
twoD1[1][0] = "k";
twoD1[1][1] = "u";
twoD1[1][2] = "w";
twoD1[2][0] = "z";
twoD1[2][1] = "g";
twoD1[2][2] = "h";
twoD2[0][0] = 15;
twoD2[0][1] = 7;
twoD2[0][2] = 20;
twoD2[1][0] = 30;
twoD2[1][1] = 11;
twoD2[1][2] = 18;
twoD2[2][0] = 22;
twoD2[2][1] = 16;
twoD2[2][2] = 5;
while (i < 3){
j = 2;
while (j >= 0){
System.out.println(twoD1[i][j] + twoD2[j][i]);
j--;
}
++i;
}
}
}