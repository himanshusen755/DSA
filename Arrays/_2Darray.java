package Arrays;
/*
 * 2D Array is nothing but matrix in which m is row and n is column 
 * 2 method of storing
 * 1 row wise
 * 2 column wise
 * array[m][n] 
 * Adressing of an element in an array 
 * Adress in 1D array = Base address + (Index - base index )* data type bytes  
 * Address in 2D array = Base address + ((i- lower index)*n)+(j-lower  index)] * bytes  //LOWER INDEX means row lower bound 
 * i = row which to find , j = column which have to find 
 * m = row of given array , n =  column of a given array 
 * COLUMN MAJOR
 * Address = Base address + ((j- lower index)*m)+(i-lower  index)] * bytes //LOWER index means Column lower bound
 * Time complexities in 2D array is O(m*n)
 */

