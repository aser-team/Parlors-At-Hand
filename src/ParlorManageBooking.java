

public class ParlorManageBooking {
private String ParlorName;
private String ServiceName;
private String Price;
private String DateAndTime;
private String BookStatus;

        public ParlorManageBooking(String ParlorName,String ServiceName,String Price,String DateAndTime,String BookStatus)
        {
            this.ParlorName=ParlorName;
            this.ServiceName=ServiceName;
            this.Price=Price;
            this.DateAndTime=DateAndTime;
            this.BookStatus=BookStatus;
        }

        public String getParlorName()
        {
            return  ParlorName;
        }
        public String getServiceName()
        {
            return ServiceName;
        }
        public String getPrice()
        {
            return Price;
        }
        public String getDateandTime()
        {
            return DateAndTime;
        }
        public String getBookStatus()
        {
            return BookStatus;
        }
}