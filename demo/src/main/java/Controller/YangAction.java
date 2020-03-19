package Controller;

import Service.YangService;
import Service.YangServiceImpl;

public class YangAction {


    public static void main(String[] args) {

        YangService yangService = new YangServiceImpl();

        yangService.getString();
    }


}
