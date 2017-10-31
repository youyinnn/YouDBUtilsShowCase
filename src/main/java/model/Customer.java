package model;

/**
 * @description:
 * @author: youyinnn
 * @date: 2017/10/16
 */
public class Customer {

    /**
     * 千万要使用包装类 如果是int 则初始值是0 自增键只有在值为null的时候有效
     */
    private Integer id;
    private String name;
    private Integer balance;
    private String address;

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", address='" + address + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
