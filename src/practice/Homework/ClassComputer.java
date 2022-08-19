package practice.Homework;

public class ClassComputer {
    public static void main(String[] args) {
        String computerBrand = "Apple MacBook Pro (Retina, 15-inch, Mid 2014) ";
        String computerProcessor = " 2.2 GHz Quad-Core Intel Core i7 ";
        String ramMemory = "16 GB 1600 MHz DDR3";
        String storageMemory = " 256 GB SSD";
        boolean hasMonitor = true;
        boolean hasWifiCard = true;
        double price = 999.99;
        int numberOfSlot = 2;
        boolean hasBluetooth = true;
        System.out.println("Alper's Computer information :");
        System.out.println("Computer Brand = " + computerBrand);
        System.out.println("Computer Processor = " + computerProcessor);
        System.out.println("Ram Memory = " + ramMemory);
        System.out.println("Storage Memory = " + storageMemory + " APPLE SSD SM0256F");
        System.out.println("Has Monitor = " + hasMonitor +" DELL U2719DX Display 27-inch (1440 × 2560)" );
        System.out.println("Has Wifi Card = " + hasWifiCard + " Broadcom BCM43xx 1.0 (7.77.111.1 AirPortDriverBrcmNIC-1680.8)");
        System.out.println("Price = $" + price);
        System.out.println("Number Of USB Slot = " + numberOfSlot + " AppleUSBXHCILPTH");
        System.out.println("Has Bluetooth = " + hasBluetooth + " Apple Bluetooth Software Version:8.0.5d7");

    }
}
//create a class Computer
//create a main method
//
//    declare and assign these variables with the most appropriate datatypes:
//
//        brand, processor, ram memory, storage memory, has monitor, has wifi card, price, number of USB slots, has Bluetooth
//
//        create a summary of the information and print it. Be creative