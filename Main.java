import java.util.Scanner;
import java.lang.Float;

public class Main {
    float personal;
    float govt1, govt2;
    float shop1, shop2, shop3, shop4;
    float donate1, donate2;
    boolean isMarried, isEmployee;

    Scanner inputA = new Scanner(System.in);
    Scanner inputB = new Scanner(System.in);

    public void main() {
        income: while (true) {
            status: while (true) {
                System.out.print("สถานะ (single/married): ");
                String status = inputA.nextLine();
                switch (status) {
                    case "single":
                        isMarried = false;
                        break status;
                    case "married":
                        isMarried = true;
                        break status;
                    default:
                        System.out.println("กรุณาลองอีกครั้ง");           
                }
            }
            System.out.print("เงินเดือนหรือเงินได้ตามสัญญาจ้างแรงงาน (มาตรา 40(1)): ");
            float salary1 = inputA.nextFloat();
            System.out.print("เงินได้ที่นายจ้างจ่ายให้ครั้งเดียวเพราะเหตุออกจากงาน (กรณีไม่นำไปรวมคำนวณภาษี) (มาตรา 40(1)): ");
            float salary2 = inputA.nextFloat();
            System.out.print("เงินได้จากการรับจ้าง ฟรีแลนซ์ ค่าตำแหน่ง เบี้ยประชุม หรือค่านายหน้า (มาตรา 40(2)): ");
            float freelance = inputA.nextFloat();
            System.out.print("ค่าลิขสิทธิ์ ค่าสิทธิ์ในทรัพย์สินทางปัญญา (Royalty) และ ค่ากู๊ดวิลล์ (Goodwill) หรือ เงินได้รายปีที่ได้มาจากนิติกรรม และคำพิพากษาของศาล (มาตรา 40(3)): ");
            float asset1 = inputA.nextFloat();
            System.out.print("ค่าเช่า ค่าผิดสัญญาเช่าซื้อหรือซื้อขายเงินผ่อน (มาตรา 40(5)): ");
            float asset2 = inputA.nextFloat();
            System.out.print("ค่าตอบแทนจากการประกอบวิชาชีพอิสระ วิชากฎหมาย การประกอบโรคศิลปะ วิศวกรรม สถาปัตยกรรม การบัญชี ประณีตศิลปกรรม (มาตรา 40(6)): ");
            float asset3 = inputA.nextFloat();
            System.out.print("เงินได้จากธุรกิจ การพาณิชย์ การเกษตร การอุตสาหกรรม การขนส่ง และเงินได้อื่นๆ (มาตรา 40(8)): ");
            float asset4 = inputA.nextFloat();
            System.out.print("เงินได้จากการขายอสังหาริมทรัพย์ฯ (มาตรา 40(8)): ");
            float asset5 = inputA.nextFloat();
            System.out.print("ดอกเบี้ย เงินเทียบเท่าเงินปันผล เงินปันผลจากบริษัทต่างประเทศ ประโยชน์ใดๆ จากคริปโทเคอร์เรนซีหรือโทเคนดิจิทัล เงินเพิ่มทุน เงินลดทุน (มาตรา 40(4)): ");
            float invest1 = inputA.nextFloat();
            System.out.print("เงินปันผล ส่วนแบ่งกำไรจากหุ้น/กองทุน (มาตรา 40(4)(ข)): ");
            float invest2 = inputA.nextFloat();
            System.out.print("เงินได้พึงประเมินที่ได้ใช้สิทธิเลือกเสียภาษีโดยไม่ต้องนำมารวมคำนวณภาษีกับเงินได้อื่น: ");
            float invest3 = inputA.nextFloat();
            System.out.print("กำไรจากการขายกองทุนรวมเพื่อการเลี้ยงชีพ (RMF): ");
            float invest4 = inputA.nextFloat();
            System.out.print("กำไรจากการขายกองทุนรวมหุ้นระยะยาว (LTF): ");
            float invest5 = inputA.nextFloat();
            System.out.print("กำไรจากการขายกองทุนเพื่อการออม (SSF): ");
            float invest6 = inputA.nextFloat();
            System.out.print("เงินได้จากการให้หรือการรับ (มาตรา 40(8)): ");
            float inherit = inputA.nextFloat();
            float salaryFinal = salary1 + salary2;
            float assetFinal = asset1 + asset2 + asset3 + asset4 + asset5;
            float investFinal = invest1 + invest2 + invest3 + invest4 + invest5 + invest6;
            float incomeFinal = salaryFinal + freelance + assetFinal + investFinal + inherit;
            System.out.println("*****สรุปเงินได้*****");
            System.out.println("รายได้จากเงินเดือน: " + salaryFinal + " บาท");
            System.out.println("รายได้จากฟรีแลนซ์, รับจ้างทั่วไป: " + freelance + " บาท");
            System.out.println("รายได้จากทรัพย์สิน, การทำธุรกิจ, อาชีพอิสระ: " + assetFinal + " บาท");
            System.out.println("รายได้จากการลงทุน: " + investFinal + " บาท");
            System.out.println("รายได้จากมรดกหรือได้รับมา: " + inherit + " บาท");
            System.out.println("******************");
            System.out.println("เงินได้รวม: " + incomeFinal + " บาท");
            System.out.println("******************");
            confirm: while (true) {
                System.out.println("กรุณาตรวจสอบความถูกต้องของข้อมูล");
                System.out.print("ข้อมูลถูกต้องหรือไม่ (y/n): ");
                String confirm = inputB.nextLine();
                switch (confirm) {
                    case "y":
                        break income;
                    case "n":
                        break confirm;
                    default:
                        System.out.println("กรุณาลองอีกครั้ง");     
                }
            }
        }
        float x = 120000;
        if (Float.compare(incomeFinal, x) < 0) {
            personal = 0;
        }
        else if (isMarried == false) {
            personal = 60000;
        }
        else {
            System.out.print("คู่สมรสของท่าน มีรายได้หรือไม่ (y/n): ");
            String haveIncome = inputA.nextLine();
            switch (haveIncome) {
                case "y":
                    while (true) {
                        System.out.println("ค่าลดหย่อนผู้มีเงินได้: ");
                        personal = inputA.nextFloat();
                        if (personal <= 120000) {
                            break;
                        }
                        else {
                            System.out.println("ไม่สามารถลดได้หย่อนเกิน 120,000 บาท");
                        }
                    }
                    break;
                case "n":
                    personal = 60000;
                    break;
            }
        }
        System.out.print("ลดหย่อนบุตร (จำนวนคน): ");
        int child = inputA.nextInt();
        System.out.print("อุปการะเลี้ยงดูบิดามารดา (จำนวนคน): ");
        int parent = inputA.nextInt();
        System.out.print("เบี้ยประกันสุขภาพบิดามารดา (จำนวนคน): ");
        int parentInsur = inputA.nextInt();
        System.out.print("เงินสะสมกองทุนสำรองเลี้ยงชีพ: ");
        float ex1 = inputA.nextFloat();
        child = child * 30000;
        parent = parent * 30000;
        parentInsur = parentInsur * 15000;

        // not finished yet

    }
    public static void main(String args[]) {
        Main run = new Main();
        run.main();
    }
}
