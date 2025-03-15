// Maximum weight Node Test cases

public class MaxWeightTestCases {
    
    public static int[] test1 = {
        1,50,-1,-1,-1,-1,-1,-1,
        -1,-1,-1,-1,-1,-1,-1,-1,
        -1,-1,-1,-1,-1,-1,-1,-1,
        -1,-1,-1,-1,-1,-1,-1,-1,
        -1,-1,-1,-1,-1,-1,-1,-1,
        -1,-1,-1,-1,-1,-1,-1,-1,
        -1,-1,-1,-1
    };

    public static int[] test2 = {
        2,13,4,5,1,6,5,10,1,
        5,10,10,-1,12,-1,9,2,
        2,5,4,8,3,2,6,6
    };

    public static int[] test3 = {
        4,13,4,5,1,6,5,10,1,
        5,10,10,-1,12,-1,12,1,
        5,0,4,6,7,2,3,11,10,
        8,9,18,1,4,3,-1,5,7,
        7,4,9,11,11,8,13,17,
        12,12,13,15,19,3,3,3,
        4,5,6,7,3,9,10,11,
        12,13,8,8,8,17,18,
        16
    };

    public static int[] test4 = {
        4,13,4,5,1,6,5,10,1,
        5,10,10,-1,12,-1,12,1,
        5,0,4,6,7,2,3,11,10,
        8,9,18,1,4,3,-1,5,7,
        7,4,9,11,11,8,13,17,
        12,12,13,15,19,3,3,3,
        4,5,6,7,3,9,10,11,
        12,13,8,8,8,17,18,
        16

    };

    public static int[] test5 = {
            4,12,1,5,0,4,6,7,2,
            3,11,10,8,9,9,2,2,5,
            4,8,3,2,6,6,18,1,4,
            3,-1,5,7,7,4,9,11,11,
            8,13,17,12,12,13,15,
            201,1,2,3,4,5,6,7,8,
            9, 10, 11, 12, 13, 
            14, 15, 16, 17, 18, 19,
            20, 21, 22, 23, 24, 25,
            26, 27, 28, 29, 30, 31,
            32, 33, 34, 35, 36, 37,
            38, 39, 40, 41, 42, 43,
            44, 45, 46, 47, 48, 49,
            50, 51, 52, 53, 54, 55,
            56, 57, 58, 59, 60, 61,
            62, 63, 64, 65, 66, 67,
            68, 69, 70, 71, 72, 73,
            74, 75, 76, 77, 78, 79,
            80, 81, 82, 83, 84, 85,
            86, 87, 88, 89, 90, 91,
            92, 93, 94, 95, 96, 97, 
            98, 99, 0, 102,
            102,102,102,102,
            102,102,102,102,
            102,102,102,102,
            102,102,102,102,
            102,102,102,102,
            102,102,102,102,
            102,102,102,102,
            102,102,102,102,
            102,102,102,102,
            102,102,102,102,
            102,102,102,102,
            102,102,102,102,
            102,102,102,102,
            102,102,102,102,
            102,102,102,102,
            102,102,102,102,
            102,102,102,102,
            102,102,102,102,
            102,102,102,102,
            102,102,102,102,
            102,102,102,102,
            102,102,102,102,
            102,102,102,102,
            102,102,102,102,
            102,102,102,-1,
    };

    public static int[] test6 = {
            3,9,2,2,5,4,8,3,2,6,
            6,18,1,4,3,-1,5,7,7,
            4,9,11,11,8,13,17,12,
            12,13,15,10,4,5,1,6,
            5,2,1,5,9,9
    };

    public static int[] test7 = {
            4,19,3,3,3,4,5,6,7,
            3,9,10,11,12,13,8,8,
            8,17,18,16,12,1,5,0,
            4,6,7,2,3,11,10,8,9,
            15,5,3,3,9,8,4,1,3,
            7,0,11,10,10,10,10,
            50,-1,-1,-1,-1,-1,-1,-1,
            -1,-1,-1,-1,-1,-1,-1,-1
            -1,-1,-1,-1,-1,-1,-1,-1
            -1,-1,-1,-1,-1,-1,-1,-1
            -1,-1,-1,-1,-1,-1,-1,-1
            -1,-1,-1,-1,-1,-1,-1,-1
            -1,-1,-1
    };

    public static int[] test8 = {
            1,9,2,2,5,4,8,3,2,6,6
    };

    public static int[] test9 = {
            3,15,5,3,3,9,8,4,1,
            3,7,0,11,10,10,10,
            10,50,-1,-1,-1,-1,-1,
            -1,-1,-1,-1,-1,-1,
            -1,-1,-1,-1,-1,-1,
            -1,-1,-1,-1,-1,-1,
            -1,-1,-1,-1,-1,-1,
            -1,-1,-1,-1,-1,-1,
            -1,-1,-1,-1,-1,201,1,2,
            3, 4, 5, 6, 7, 8, 9, 
            10, 11, 12, 13, 14, 15, 16,
            17, 18, 19, 20, 21, 22, 23,
            24, 25, 26, 27, 28, 29, 30,
            31, 32, 33, 34, 35, 36, 37,
            38, 39, 40, 41, 42, 43, 44,
            45, 46, 47, 48, 49, 50, 51,
            52, 53, 54, 55, 56, 57, 58,
            59, 60, 61, 62, 63, 64, 65,
            66, 67, 68, 69, 70, 71, 72,
            73, 74, 75, 76, 77, 78, 79,
            80, 81, 82, 83, 84, 85, 86,
            87, 88, 89, 90, 91, 92, 93,
            94, 95, 96, 97, 98, 99, 0, 
            102,102,102,102,
            102,102,102,102,
            102,102,102,102,
            102,102,102,102,
            102,102,102,102,
            102,102,102,102,
            102,102,102,102,
            102,102,102,102,
            102,102,102,102,
            102,102,102,102,
            102,102,102,102,
            102,102,102,102,
            102,102,102,102,
            102,102,102,102,
            102,102,102,102,
            102,102,102,102,
            102,102,102,102,
            102,102,102,102,
            102,102,102,102,
            102,102,102,102,
            102,102,102,102,
            102,102,102,102,
            102,102,102,102,
            102,102,102,102,
            102,102,102,102, -1


    };

    public static int[] test10 = {
            9,10,4,5,1,6,5,2,1,5,
            9,9,13,4,5,1,6,5,10,
            1,5,10,10,-1,12,-1,19,
            3,3,3,4,5,6,7,3,9,
            10,11,12,13,8,8,8,17,
            18,16,12,12,1,5,0,4,6,
            7,2,3,11,10,8,9,15,5,
            3,3,9,8,4,1,3,7,0,11,
            10,10,10,10,50,-1,
            -1,-1,-1,-1,-1,-1,-1,-1,
            -1,-1,-1,-1,-1,-1,-1,-1,
            -1,-1,-1,-1,-1,-1,-1,-1,
            -1,-1,-1,-1,-1,-1,-1,-1,
            -1,-1,-1,-1,-1,-1,-1,-1,
            -1,-1,-1,-1,-1,-1,-1,-1,
            -1,9,2,2,5,4,8,3,2,
            6,6,18,1,4,3,-1,5,7,
            7,4,9,11,11,8,13,17,
            12,12,13,15,201,1,2,
            3, 4, 5, 6, 7, 8, 9, 
            10, 11, 12, 13, 14, 15, 16,
            17, 18, 19, 20, 21, 22, 23,
            24, 25, 26, 27, 28, 29, 30,
            31, 32, 33, 34, 35, 36, 37,
            38, 39, 40, 41, 42, 43, 44,
            45, 46, 47, 48, 49, 50, 51,
            52, 53, 54, 55, 56, 57, 58,
            59, 60, 61, 62, 63, 64, 65,
            66, 67, 68, 69, 70, 71, 72,
            73, 74, 75, 76, 77, 78, 79,
            80, 81, 82, 83, 84, 85, 86,
            87, 88, 89, 90, 91, 92, 93,
            94, 95, 96, 97, 98, 99, 0,
            102,102,102,102,
102,102,102,102,
102,102,102,102,
102,102,102,102,
102,102,102,102,
102,102,102,102,
102,102,102,102,
102,102,102,102,
102,102,102,102,
102,102,102,102,
102,102,102,102,
102,102,102,102,
102,102,102,102,
102,102,102,102,
102,102,102,102,
102,102,102,102,
102,102,102,102,
102,102,102,102,
102,102,102,102,
102,102,102,102,
102,102,102,102,
102,102,102,102,
102,102,102,102,
102,102,102,102,
102,102,102,102,-1

    };



    public static void main(String[] args) {
        System.out.println(test2.length);
    }
}
