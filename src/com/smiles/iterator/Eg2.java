package com.smiles.iterator;

public class Eg2 {
    public static void main(String[] args) {
        ProductCollection products = new ProductCollection();

        products.push("Apple");
        products.push("Samsung");
        products.push("Huawei");
        products.push("Xiaomi");

        Iterator<String> iterator = products.createArrayIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }

    static class ProductCollection {
        private String[] products = new String[10];
        private int count;

        public void push(String product) {
            products[count++] = product;
        }

        public ArrayIterator createArrayIterator() {
            return new ArrayIterator(this);
        }

        static class ArrayIterator implements Iterator<String> {
            private ProductCollection productCollection;
            private int index;

            public ArrayIterator(ProductCollection productCollection) {
                this.productCollection = productCollection;
            }

            @Override
            public boolean hasNext() {
                return index < productCollection.products.length;
            }

            @Override
            public String current() {
                return productCollection.products[index];
            }

            @Override
            public void next() {
                index++;
            }
        }
    }
}
