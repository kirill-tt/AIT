package practice.HWCube.model;
//Создать класс Cube, описывающий куб cо стороной a.
// Реализовать в нем методы определения периметра p (сумма длин всех ребер),
// площади s (сумма площадей всех граней) и объема v.
// Создать приложение CubeAppl, в котором создать несколько экземпляров класса Cube.
// Для каждого экземпляра вызвать методы класса Cube и рассчитать p, s и v.
public class HWCube {
    private double sideLength; // Длина стороны куба

    public HWCube(double sideLength) {
        this.sideLength = sideLength;
    }

    public double cubeSideLength() { // Длина стороны куба
        return sideLength;
    }
    public double cubePerimeter() {
        return 12 * sideLength; // Периметр куба
    }

    public double cubeSurfaceArea() {
        return 6 * sideLength * sideLength; // Площадь поверхности куба
    }

    public double cubeVolume() {
        return sideLength * sideLength * sideLength; // Объем куба
    }
    public void  display(){ // печать
        System.out.println("Cube: " + "Side Length: " + cubeSideLength() +  ", Perimeter:  " + cubePerimeter() + ", Surface Area : " + cubeSurfaceArea() + ", Volume : " + cubeVolume());
    }
}
