package wms.unittest;


import org.junit.Test;
import wms.administrator.CommonAdministrator;
import wms.manage.Goods;
import wms.manage.IncomingOrder;
import wms.manage.OutboundOrder;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCommon {
    @Test
    public void test_CreateOder1(){
        CommonAdministrator common = new CommonAdministrator(20,"王一",25,"199456123789",
                "wy123");
        ArrayList<IncomingOrder> listIn = new ArrayList<>();
        common.create_incoming_order(Goods.goods_1,listIn);

    }

    @Test
    public void test_CreateOrder2() {
        CommonAdministrator common = new CommonAdministrator(20,"王一",25,"199456123789",
                "wy123");
        ArrayList<OutboundOrder> listOut = new ArrayList<>();
        common.create_outbound_order(Goods.goods_2, listOut);
    }

    @Test
    public void test1(){
        CommonAdministrator common = new CommonAdministrator(20,"王一",25,"199456123789",
                "wy123");
        ArrayList<Goods> goodsArrayList = common.get_goods("男", "", "");
        Iterator<Goods> iterator = goodsArrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().getGoods_name());
        }
    }
}
