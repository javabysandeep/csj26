package oops.abstraction.interfaceDemos;

public class Demo1 {
    public static void main(String[] args) {
        AbstractService abstractService = new AbstractService() {
            @Override
            void m1() {

            }
        };
    }
}
//anonymous class
abstract class AbstractService{
    abstract void m1();
}
class ServiceImpl extends AbstractService {

    @Override
    void m1() {

    }
}
interface InterfaceService{
    void m1();
}
class InterfaceServiceImpl implements  InterfaceService{

    @Override
    public void m1() {

    }
}












