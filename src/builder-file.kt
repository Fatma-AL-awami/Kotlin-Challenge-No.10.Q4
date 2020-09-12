 class Employee ( firstName: String="" ,lastName: String="" ,id: String ,isManager:Boolean=true,
 managerId:String="")
 {
var firstName1: String
 var lastName1: String
 var id1: String
 var isManager1:Boolean
 var managerId1:String
init {
    this.firstName1=firstName
    this.lastName1=lastName
    this.id1=id
    this.isManager1=isManager
    this.managerId1=managerId
}


  fun setFirstName(firstName:String ):Employee {
    this.firstName1 = firstName;
    return this;
}

  fun setLastName(lastName:String):Employee{
    this.lastName1 = lastName;
    return this;
}

   fun setId(id:String):Employee {
    this.id1 = id;
    return this;
}

 fun setIsManager(manager:Boolean):Employee {
    isManager1 = manager;
    return this;
}

 fun setManagerId( managerId:String) :Employee{
    this.managerId1 = managerId;
    return this;
}
}

 fun main(){
     var emlpyee =Employee(id="100070").setFirstName("Doug")
         .setLastName("segibaum")
         .setManagerId("xxx")
         .setIsManager(false)


 }