// Cuboid is rectangle with a height.


class Video_033_Cuboid
{
    public static void main(String args[])
    {
        float length, breadth, height, volume, area, area_bottom, area_front, area_back;

        area_bottom = 2 * length * breadth;
        area_front = 2 * length * breadth;
        area_back = 2 * length * breadth;

        area = area_back + area_bottom + area_front;

        System.out.printf("Area is ":+area);
        System.out.printf("Volume is "+volume);
    }

}
