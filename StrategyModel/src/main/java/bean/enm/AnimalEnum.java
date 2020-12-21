package bean.enm;

import bean.Common;

/**
 * @ClassName AnimalEnum
 * @Description: TODO
 * @Author lxc
 * @Date 2020/12/21 12:00
 * @Version V1.0
 **/
public enum AnimalEnum implements Common {
   PANDA("panda",21,"竹子"){
       @Override
       public String eat(String food) {
           return PANDA.fd;
       }
   },DOG("DOG",22,"骨头"){
        @Override
        public String eat(String food) {
            return DOG.fd;
        }
    },CAT("CAT",23, "鱼"){
        @Override
        public String eat(String food) {
            return CAT.fd;
        }
    }
    ;
    private String fd;
    private String name;
    private Integer weitht;
    AnimalEnum(String name, int i,String food) {
        this.name=name;
        this.weitht=i;
        this.fd=food;
    }
}
