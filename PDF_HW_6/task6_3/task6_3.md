```java
class MedicalStaff{}
class Doctor extends MedicalStaff{}
class Nurse extends MedicalStaff{}
class HeadDoctor extends Doctor{}
```

<h1 align = "center">Task 3. References on collections</h1>
<table border="1">
	<tr align = "center">
		<td><b>Operation</b></td>
		<td><b>Correct</b></td>
		<td><b>Incorrect</b></td>
		<td><b>Explain</b></td>
	</tr>
	<tr>
		<td>Doctor doctor1 = new Doctor();</td>
		<td>[+]</td>
		<td>[ ]</td>
		<td>We can create object of the same class</td>
	</tr>
	<tr>
		<td>Doctor doctor2 = new MedicalStaff();</td>
		<td>[ ]</td>
		<td>[+]</td>
		<td>
			Incompatible types.<br>
			Class Doctor doesn`t know about MedicalStaff class.<br>
			Instead we should write: MedicalStaff doctor2 = new Doctor();
		</td>
	</tr>
	<tr>
		<td>Doctor doctor3 = new HeadDoctor();</td>
		<td>[+]</td>
		<td>[ ]</td>
		<td>
			Same reason as in previous one.<br>
			HeadDoctor extends Doctor.
		</td>
	</tr>
	<tr>
		<td>Object object1 = new HeadDoctor();</td>
		<td>[+]</td>
		<td>[ ]</td>
		<td>
			Everything in java is Object.<br>
			HeadDoctor extends Doctor -> Doctor extends MedicalStaff->MedicalStaff extends Object implicitly.
		</td>
	</tr>
	<tr>
		<td>HeadDoctor doctor5 = new Object();</td>
		<td>[ ]</td>
		<td>[+]</td>
		<td>
			Because Object doesn`t know about HeadDoctor class.<br>
			Watch "Doctor doctor2 = new MedicalStaff();"
		</td>
	</tr>
	<tr>
		<td>Doctor doctor6 = new Nurse();</td>
		<td>[ ]</td>
		<td>[+]</td>
		<td>
			The same reason as in previous one.<br>
			We could do: Nurse doctor6 = new Doctor();<br>
			But it won`t work niether because these classes are not connected.
		</td>
	</tr>
	<tr>
		<td>Nurse nurse = new Doctor();</td>
		<td>[ ]</td>
		<td>[+]</td>
		<td>
			The same reason as in previous one.<br>
		</td>
	</tr>
	<tr>
		<td>Object object2 = new Nurse();</td>
		<td>[ ]</td>
		<td>[+]</td>
		<td>
			The same reason as in "Object object1 = new HeadDoctor();"
		</td>
	</tr>
	<tr>
		<td colspan="4" align = "center">List</td>
	</tr>
	<tr>
		<td>List&lt;Doctor&gt; list1= new ArrayList&lt;Doctor&gt;();</td>
		<td>[+]</td>
		<td>[ ]</td>
		<td>
			List is Interfece.<br>
			ArrayList implements List.<br>
			Parameters are the same.
		</td>
	</tr>
	<tr>
		<td>List&lt;MedicalStaff&gt; list2 = new ArrayList&lt;Doctor&gt;();</td>
		<td>[ ]</td>
		<td>[+]</td>
		<td>
			Different parameter types.
		</td>
	</tr>
	<tr>
		<td>List&lt;Doctor&gt; list3 = new ArrayList&lt;MedicalStaff&gt;();</td>
		<td>[ ]</td>
		<td>[+]</td>
		<td>
			Different parameter types.
		</td>
	</tr>
	<tr>
		<td>List&lt;Object&gt; list4 = new ArrayList&lt;Doctor&gt;();</td>
		<td>[ ]</td>
		<td>[+]</td>
		<td>
			Different parameter types.
		</td>
	</tr>
	<tr>
		<td>List&lt;Object&gt; list5 = new ArrayList&lt;Object&gt;();</td>
		<td>[+]</td>
		<td>[ ]</td>
		<td>
			Parameters are the same;
		</td>
	</tr>
</table>