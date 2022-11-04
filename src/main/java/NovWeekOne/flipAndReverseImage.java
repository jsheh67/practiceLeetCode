package NovWeekOne;

import java.util.Arrays;
import java.util.Collections;

public class flipAndReverseImage {
    public int[][] flipAndInvertImage(int[][] image) {

        for(int i=0; i<image.length; i++){

            int l= image.length-1;
           for(int j=0; j< image.length/2; j++){
               int temp=image[i][j];
               image[i][j]=image[i][l];
               image[i][l]=temp;
               l--;
           }
        }
        for(int i=0; i< image.length; i++){
            for(int j=0; j<image.length; j++){
                if(image[i][j]==0){
                    image[i][j]=1;
                }else{
                    image[i][j]=0;
                }
            }
        }


        return image;
    }
}
