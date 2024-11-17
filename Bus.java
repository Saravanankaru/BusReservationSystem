package BusRev;

public class Bus {
  private int Busno;
  private Boolean ac;
  private int capacity;
public Bus(int busno, Boolean ac, int cap) {
	this.Busno = busno;
	this.ac = ac;
	this.capacity = cap;
}
public int getBusno() {
	return Busno;
}
public void setBusno(int busno) {
	Busno = busno;
}
public Boolean getAc() {
	return ac;
}
public void setAc(Boolean ac) {
	this.ac = ac;
}
public int getCapacity() {
	return capacity;
}
public void setCapacity(int capacity) {
	this.capacity = capacity;
}


  
}
