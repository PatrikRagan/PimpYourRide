package aspects;

public aspect PersistenceAspect {
 int timeAmount;
 public int calledCount = 0; 
 //TODO: pocitadlo volani a cas ktory uplinie medzi volaniami
 //TODO: pred volanim metodz zmeny Car zavola serializeNow
}
