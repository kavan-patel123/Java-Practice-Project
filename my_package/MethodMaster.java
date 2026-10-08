package my_package;

public class MethodMaster {

    // ૧. Public Method
    public void publicMethod() {
        System.out.println("Public Method: ચાલશે ✅");
    }

    // ૨. Private Method
    private void privateMethod() {
        System.out.println("Private Method: ફક્ત આ જ ક્લાસમાં ચાલશે.");
    }

    // ૩. Protected Method
    protected void protectedMethod() {
        System.out.println("Protected Method: ચાલશે ✅");
    }

    // ૪. Default Method (કંઈ ન લખો તે)
    void defaultMethod() {
        System.out.println("Default Method: ચાલશે ✅");
    }

    // પ્રાઇવેટ મેથડને ક્લાસની અંદરથી જ કોલ કરવા માટે એક પબ્લિક રસ્તો
    public void callPrivateInside() {
        privateMethod(); // આ પોતાની અંદર છે એટલે ચાલશે
    }
}
