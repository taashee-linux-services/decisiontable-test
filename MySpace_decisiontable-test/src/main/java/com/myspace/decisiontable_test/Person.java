package com.myspace.decisiontable_test;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Person implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Name")
	private java.lang.String name;
	@org.kie.api.definition.type.Label("Age")
	private java.lang.Integer age;
	@org.kie.api.definition.type.Label("PersonType")
	private java.lang.String persontype;

	public Person() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.Integer getAge() {
		return this.age;
	}

	public void setAge(java.lang.Integer age) {
		this.age = age;
	}

	public java.lang.String getPersontype() {
		return this.persontype;
	}

	public void setPersontype(java.lang.String persontype) {
		this.persontype = persontype;
	}

	public Person(java.lang.String name, java.lang.Integer age,
			java.lang.String persontype) {
		this.name = name;
		this.age = age;
		this.persontype = persontype;
	}

}