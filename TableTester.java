class TableTester{
public static void main(String nike[]){

Table table = new Table();
table.setAdjustable("yes");
table.setFoldable("yes");
table.setPortable("yes");
table.setMaterial("Wood");
table.setSustainable("Regular");

System.out.println(table.getAdjustable() + " " + table.getFoldable() + " " + table.getPortable() + " " + table.getMaterial()+ " " + table.getSustainable());
}
}