import AbstractFactoryPattern.AbstractFactoryPatternTest;
import Adapter.AdapterTest;
import Bridge.BridgeTest;
import Builder.BuilderTest;
import BusinessDelegate.BusinessDelegateTest;
import ChainOfResponsibility.ChainOfResponsibilityTest;
import Command.CommandTest;
import Composite.CompositeTest;
import DataAccessObject.DataAccessObjectTest;
import Decorated.DecoratedTest;
import Facade.FacadeTest;
import Factory.FactoryTest;
import Filter.FilterTest;
import FlyweightPattern.FlyweightPatternTest;
import FrontController.FrontControllerTest;
import Interpreter.InterpreterTest;
import Iterator.IteratorTest;
import MVC.MVCTest;
import Mediator.MediatorTest;
import Memento.MementoTest;
import NullObject.NullObjectTest;
import Observer.ObserverTest;
import Prototype.PrototypeTest;
import Proxy.ProxyPatternDemo;
import ServiceLocatorPattern.ServiceLocatorPatternTest;
import Singleton.SingletonPatternDemo;
import Strategy.StrategyPatternDemo;
import State.StateTest;
import Template.TemplateTest;
import Visitor.VisitorTest;
import org.junit.Test;

import java.text.ParseException;
import java.util.Scanner;


public class testMain {
    private AbstractFactoryPatternTest AbstractFactory=new AbstractFactoryPatternTest();
    private AdapterTest Adapter=new AdapterTest();
    private BridgeTest Bridge=new BridgeTest();
    private BuilderTest Builder=new BuilderTest();
    private BusinessDelegateTest BusinessDelegate=new BusinessDelegateTest();

    private ChainOfResponsibilityTest ChainOfResponsibility=new ChainOfResponsibilityTest();
    private CommandTest Command=new CommandTest();
    private CompositeTest Composite=new CompositeTest();
    private DataAccessObjectTest DataAccessObject=new DataAccessObjectTest();
    private DecoratedTest Decorated=new DecoratedTest();

    private FacadeTest Facade=new FacadeTest();
    private FactoryTest Factory=new FactoryTest();
    private FilterTest Filter=new FilterTest();
    private FlyweightPatternTest Flyweight=new FlyweightPatternTest();
    private FrontControllerTest FrontController=new FrontControllerTest();

    private InterpreterTest Interpreter=new InterpreterTest();
    private IteratorTest Iterator=new IteratorTest();
    private MediatorTest Mediator=new MediatorTest();
    private MementoTest Memento=new MementoTest();
    private MVCTest MVC=new MVCTest();

    private NullObjectTest NullObject=new NullObjectTest();
    private ObserverTest Observer=new Observer.ObserverTest();
    private PrototypeTest Prototype=new PrototypeTest();
    private ProxyPatternDemo Proxy=new ProxyPatternDemo();
    private ServiceLocatorPatternTest ServiceLocator=new ServiceLocatorPatternTest();

    private SingletonPatternDemo Singleton=new SingletonPatternDemo();
    private StateTest State=new StateTest();
    private StrategyPatternDemo Strategy=new StrategyPatternDemo();
    private TemplateTest Template=new TemplateTest();
    private VisitorTest Visitor=new VisitorTest();

    Scanner sc=new Scanner(System.in);
    public void Pause(){
        System.out.println("???1??????...\n");
        while (!sc.nextLine().equals("1"));
        //while(sc.nextInt()!=1);
    }
    public void show(String pattern){
        System.out.format("\33[%dm%s",94,"");
        System.out.println(
                "===============\n" +
                "* "+pattern+"?????? *\n" +
                "===============\n");
        System.out.format("\33[%dm%s",0,"");
    }

    @Test

    public void Test() throws ParseException, InterruptedException {

        int exit=1;
        String order;
        while(exit==1){

            System.out.format("\33[%dm%s",96,"");
            System.out.println("====Menu====\n"+
                    "0.??????\n" +
                    "1.????????????\n" +
                    "2.??????????????????\n" +
                    "3.????????????\n" +
                    "4.???????????????\n"+
                    "5.????????????\n" +
                    "6.???????????????\n" +
                    "7.????????????\n" +
                    "8.???????????????\n" +
                    "9.????????????\n" +
                    "10.???????????????\n" +
                    "11.????????????\n" +
                    "12.????????????\n" +
                    "13.????????????\n" +
                    "14.???????????????\n" +
                    "15.????????????\n" +
                    "16.???????????????\n" +
                    "17.???????????????\n" +
                    "18.???????????????\n" +
                    "19.???????????????\n" +
                    "20.???????????????\n" +
                    "21.????????????\n" +
                    "22.????????????\n" +
                    "23.????????????\n" +
                    "24.???????????????\n" +
                    "25.???????????????\n" +
                    "26.MVC??????\n" +
                    "27.??????????????????\n" +
                    "28.????????????????????????\n" +
                    "29.?????????????????????\n" +
                    "30.?????????????????????\n"+
                    "====Menu====\n");
            System.out.format("\33[%dm%s",0,"");
            System.out.println("??????????????????");
            order=this.sc.nextLine();

            switch(order){
                case "0":
                    exit=0;
                    break;
                case "1":
                    this.Factory.factoryTest();
                    break;
                case "2":
                    this.AbstractFactory.testAbstractFactoryPattern();
                    break;
                case"3":
                    this.Singleton.singletonTest();
                    break;
                case"4":
                    this.Builder.builderTest();
                    break;
                case"5":
                    this.Prototype.prototypeTest();
                    break;
                case"6":
                    this.Adapter.adapterTest();
                    break;
                case"7":
                    this.Bridge.bridgeTest();
                    break;
                case"8":
                    this.Filter.TestFilter();
                    break;
                case"9":
                    this.Composite.testComposite();
                    break;
                case"10":
                    this.Decorated.testDecorated();
                    break;

                case "11":
                    this.Facade.facadeTest();
                    break;
                case "12":
                    this.Flyweight.testFlyweightPattern();
                    break;
                case"13":
                    this.Proxy.proxyTest();
                    break;
                case"14":
                    this.ChainOfResponsibility.performTest();
                    break;
                case"15":
                    this.Command.commandTest();
                    break;
                case"16":
                    this.Interpreter.interpreterTest();
                    break;
                case"17":
                    this.Iterator.iteratorTest();
                    break;
                case"18":
                    this.Mediator.TestMediator();
                    break;
                case"19":
                    this.Memento.TestMemento();
                    break;
                case"20":
                    this.Observer.testObserver();
                    break;

                case "21":
                    this.State.stateTest();
                    break;
                case "22":
                    this.Template.templateTest();
                    break;
                case"23":
                    this.Strategy.strategyTest();
                    break;
                case"24":
                    this.NullObject.TestNullObject();
                    break;
                case"25":
                   this.Visitor.visitorTest();
                    break;
                case"26":
                    this.MVC.mvcTest();
                    break;
                case"27":
                    this.BusinessDelegate.businessDelegateTest();
                    break;
                case"28":
                    this.DataAccessObject.testDataAccessObject();
                    break;
                case"29":
                    this.FrontController.testFrontController();
                    break;
                case"30":
                    this.ServiceLocator.testServiceLocatorPattern();
                    break;

            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //        System.out.println("=====================\n" +
//                           "* 23??????????????????????????? *\n" +
//                           "=====================\n");
/*
        Pause();
        show("????????????");
        this.Factory.factoryTest();

        Pause();
        show("??????????????????");
        this.AbstractFactory.testAbstractFactoryPattern();

        System.out.format("\33[%dm%s",0,"");
        Pause();
        show("????????????");
        this.Singleton.singletonTest();

        Pause();
        show("???????????????");
        this.Builder.builderTest();

        Pause();
        show("????????????");
        this.Prototype.prototypeTest();

        Pause();
        show("???????????????");
        this.Adapter.adapterTest();

        Pause();
        show("????????????");
        this.Bridge.bridgeTest();

        Pause();
        show("???????????????");
        this.Filter.TestFilter();

        Pause();
        show("????????????");
        this.Composite.testComposite();

        Pause();
        show("???????????????");
        this.Decorated.testDecorated();

        Pause();
        show("????????????");
        this.Facade.facadeTest();

        Pause();
        show("????????????");
        this.Flyweight.testFlyweightPattern();

        Pause();
        show("????????????");
        this.Proxy.proxyTest();

        Pause();
        show("???????????????");
        this.ChainOfResponsibility.performTest();

        Pause();
        show("????????????");
        this.Command.commandTest();

        Pause();
        show("???????????????");
        this.Interpreter.interpreterTest();

        Pause();
        show("???????????????");
        this.Iterator.iteratorTest();

        Pause();
        show("???????????????");
        this.Mediator.TestMediator();

        Pause();
        show("???????????????");
        this.Memento.TestMemento();

        Pause();
        show("???????????????");
        this.Observer.testObserver();

        Pause();
        show("????????????");
        this.State.stateTest();

        Pause();
        show("????????????");
        this.Template.templateTest();

        Pause();
        show("????????????");
        this.Strategy.strategyTest();

        System.out.format("\33[%dm%s",94,"");

        System.out.println("=====================\n" +
                "* ?????????????????????????????? *\n" +
                "=====================\n");
        System.out.println("====================\n" +
                "* 7??????????????????????????? *\n" +
                "====================\n");
        System.out.format("\33[%dm%s",0,"");

        Pause();
        show("???????????????");
        this.NullObject.TestNullObject();

        Pause();
        show("MVC??????");
        this.MVC.mvcTest();

        Pause();
        show("???????????????");
        this.Visitor.visitorTest();

        Pause();
        show("??????????????????");
        this.BusinessDelegate.businessDelegateTest();

        Pause();
        show("?????????????????????");
        this.FrontController.testFrontController();

        Pause();
        show("?????????????????????");
        this.ServiceLocator.testServiceLocatorPattern();

        Pause();
        show("????????????????????????");
        this.DataAccessObject.testDataAccessObject();

        Pause();
        System.out.format("\33[%dm%s",94,"");
        System.out.println("=====================\n" +
                "* ?????????????????????????????? *\n" +
                "=====================\n");
        System.out.format("\33[%dm%s",0,"");
*/
    }
}
