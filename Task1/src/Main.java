import Calculator.ArithmeticCalculator;
import Calculator.Operation;
import Computer.Computer;
import Computer.HardDisc.HardDisc;
import Computer.HardDisc.TypeHardDisc;
import Computer.Keyboard.Backlight;
import Computer.Keyboard.Keyboard;
import Computer.Keyboard.TypeKeyBoard;
import Computer.Processor.Cores;
import Computer.Processor.Frequency;
import Computer.Processor.Manufacturer;
import Computer.Processor.Processor;
import Computer.Ram.Ram;
import Computer.Ram.TypeRam;
import Computer.Screen.Screen;
import Computer.Screen.TypeScreen;

public class Main {
    public static void main(String[] args) {

        Processor processor = new Processor(Frequency.TWO_THOUSAND, Cores.FOUR_CORE, Manufacturer.AMD,5);
        Ram ram = new Ram(TypeRam.DDR_4G, 10, 100);
        HardDisc hardDisc = new HardDisc(TypeHardDisc.SDD, 600, 1000);
        Screen screen = new Screen(16, TypeScreen.IPS, 2000);
        Keyboard keyboard = new Keyboard(TypeKeyBoard.WIRELESS, Backlight.YES, 300);

Computer computer = new Computer(processor, ram, hardDisc, screen, keyboard, "COMPAQ", "PROFIT-WEB");
        System.out.println(computer.getWeight() );










//
//        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(10, 5);
//        arithmeticCalculator.calculate(Operation.MULTIPLY);
    }
}