package gift.dto;

public class CreateProduct {

    public static class Request{

        private Long id;
        private String name;
        private int price;
        private String imageUrl;

        public Request(Long id, String name, int price,String imageUrl) {
            this.id=id;
            this.name=name;
            this.price=price;
            this.imageUrl=imageUrl;
        }

        public Long getId() {
            return id;
        }
        public String getName() {
            return name;
        }
        public int getPrice() {
            return price;
        }
        public String getImageUrl() {
            return imageUrl;
        }
    }

    public static class Response{
        private Long id;
        private String name;
        private int price;
        private String imageUrl;

        public Response(Long id, String name, int price,String imageUrl) {
            this.id=id;
            this.name=name;
            this.price=price;
            this.imageUrl=imageUrl;
        }
        public Long getId() {
            return id;
        }
        public String getName() {
            return name;
        }
        public int getPrice() {
            return price;
        }
        public String getImageUrl() {
            return imageUrl;
        }
        public void setId(Long id) {
            this.id = id;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setPrice(int price) {
            this.price = price;
        }
        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

    }
}
