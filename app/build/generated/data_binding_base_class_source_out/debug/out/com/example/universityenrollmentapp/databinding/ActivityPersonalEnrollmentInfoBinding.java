// Generated by view binder compiler. Do not edit!
package com.example.universityenrollmentapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.universityenrollmentapp.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityPersonalEnrollmentInfoBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView currentAddress;

  @NonNull
  public final EditText currentAddressEt;

  @NonNull
  public final TextView dateOfBirth;

  @NonNull
  public final EditText dateOfBirthBtn;

  @NonNull
  public final EditText dateOfBirthEt;

  @NonNull
  public final EditText emailAddressEt;

  @NonNull
  public final TextView emailAddressTxt;

  @NonNull
  public final TextView emergencyContactNumber;

  @NonNull
  public final EditText emergencyContactNumberEt;

  @NonNull
  public final RadioButton father;

  @NonNull
  public final EditText firstName;

  @NonNull
  public final TextView gender;

  @NonNull
  public final RadioButton guardian;

  @NonNull
  public final EditText lastName;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final RadioButton mother;

  @NonNull
  public final EditText nationalityEditTxt;

  @NonNull
  public final TextView nationalityTxt;

  @NonNull
  public final MaterialButton nextButton;

  @NonNull
  public final RadioButton other;

  @NonNull
  public final EditText parentFirstName;

  @NonNull
  public final TextView parentGuardian;

  @NonNull
  public final EditText parentLastName;

  @NonNull
  public final TextView parentNameTxt;

  @NonNull
  public final TextView permanentAddress;

  @NonNull
  public final TextView personalInfoTxt;

  @NonNull
  public final EditText phoneNumberEt;

  @NonNull
  public final TextView phoneNumberTxt;

  @NonNull
  public final EditText placeOfBirthEt;

  @NonNull
  public final TextView placeOfBirthTxt;

  @NonNull
  public final RadioGroup radioGroup;

  @NonNull
  public final RadioGroup radioGroup2;

  @NonNull
  public final ScrollView scrollable;

  @NonNull
  public final TextView studentNameTxt;

  @NonNull
  public final MaterialToolbar topAppBar;

  private ActivityPersonalEnrollmentInfoBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView currentAddress, @NonNull EditText currentAddressEt,
      @NonNull TextView dateOfBirth, @NonNull EditText dateOfBirthBtn,
      @NonNull EditText dateOfBirthEt, @NonNull EditText emailAddressEt,
      @NonNull TextView emailAddressTxt, @NonNull TextView emergencyContactNumber,
      @NonNull EditText emergencyContactNumberEt, @NonNull RadioButton father,
      @NonNull EditText firstName, @NonNull TextView gender, @NonNull RadioButton guardian,
      @NonNull EditText lastName, @NonNull ConstraintLayout main, @NonNull RadioButton mother,
      @NonNull EditText nationalityEditTxt, @NonNull TextView nationalityTxt,
      @NonNull MaterialButton nextButton, @NonNull RadioButton other,
      @NonNull EditText parentFirstName, @NonNull TextView parentGuardian,
      @NonNull EditText parentLastName, @NonNull TextView parentNameTxt,
      @NonNull TextView permanentAddress, @NonNull TextView personalInfoTxt,
      @NonNull EditText phoneNumberEt, @NonNull TextView phoneNumberTxt,
      @NonNull EditText placeOfBirthEt, @NonNull TextView placeOfBirthTxt,
      @NonNull RadioGroup radioGroup, @NonNull RadioGroup radioGroup2,
      @NonNull ScrollView scrollable, @NonNull TextView studentNameTxt,
      @NonNull MaterialToolbar topAppBar) {
    this.rootView = rootView;
    this.currentAddress = currentAddress;
    this.currentAddressEt = currentAddressEt;
    this.dateOfBirth = dateOfBirth;
    this.dateOfBirthBtn = dateOfBirthBtn;
    this.dateOfBirthEt = dateOfBirthEt;
    this.emailAddressEt = emailAddressEt;
    this.emailAddressTxt = emailAddressTxt;
    this.emergencyContactNumber = emergencyContactNumber;
    this.emergencyContactNumberEt = emergencyContactNumberEt;
    this.father = father;
    this.firstName = firstName;
    this.gender = gender;
    this.guardian = guardian;
    this.lastName = lastName;
    this.main = main;
    this.mother = mother;
    this.nationalityEditTxt = nationalityEditTxt;
    this.nationalityTxt = nationalityTxt;
    this.nextButton = nextButton;
    this.other = other;
    this.parentFirstName = parentFirstName;
    this.parentGuardian = parentGuardian;
    this.parentLastName = parentLastName;
    this.parentNameTxt = parentNameTxt;
    this.permanentAddress = permanentAddress;
    this.personalInfoTxt = personalInfoTxt;
    this.phoneNumberEt = phoneNumberEt;
    this.phoneNumberTxt = phoneNumberTxt;
    this.placeOfBirthEt = placeOfBirthEt;
    this.placeOfBirthTxt = placeOfBirthTxt;
    this.radioGroup = radioGroup;
    this.radioGroup2 = radioGroup2;
    this.scrollable = scrollable;
    this.studentNameTxt = studentNameTxt;
    this.topAppBar = topAppBar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPersonalEnrollmentInfoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPersonalEnrollmentInfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_personal_enrollment_info, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPersonalEnrollmentInfoBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.currentAddress;
      TextView currentAddress = ViewBindings.findChildViewById(rootView, id);
      if (currentAddress == null) {
        break missingId;
      }

      id = R.id.currentAddressEt;
      EditText currentAddressEt = ViewBindings.findChildViewById(rootView, id);
      if (currentAddressEt == null) {
        break missingId;
      }

      id = R.id.dateOfBirth;
      TextView dateOfBirth = ViewBindings.findChildViewById(rootView, id);
      if (dateOfBirth == null) {
        break missingId;
      }

      id = R.id.dateOfBirthBtn;
      EditText dateOfBirthBtn = ViewBindings.findChildViewById(rootView, id);
      if (dateOfBirthBtn == null) {
        break missingId;
      }

      id = R.id.dateOfBirthEt;
      EditText dateOfBirthEt = ViewBindings.findChildViewById(rootView, id);
      if (dateOfBirthEt == null) {
        break missingId;
      }

      id = R.id.emailAddressEt;
      EditText emailAddressEt = ViewBindings.findChildViewById(rootView, id);
      if (emailAddressEt == null) {
        break missingId;
      }

      id = R.id.emailAddressTxt;
      TextView emailAddressTxt = ViewBindings.findChildViewById(rootView, id);
      if (emailAddressTxt == null) {
        break missingId;
      }

      id = R.id.emergencyContactNumber;
      TextView emergencyContactNumber = ViewBindings.findChildViewById(rootView, id);
      if (emergencyContactNumber == null) {
        break missingId;
      }

      id = R.id.emergencyContactNumberEt;
      EditText emergencyContactNumberEt = ViewBindings.findChildViewById(rootView, id);
      if (emergencyContactNumberEt == null) {
        break missingId;
      }

      id = R.id.father;
      RadioButton father = ViewBindings.findChildViewById(rootView, id);
      if (father == null) {
        break missingId;
      }

      id = R.id.firstName;
      EditText firstName = ViewBindings.findChildViewById(rootView, id);
      if (firstName == null) {
        break missingId;
      }

      id = R.id.gender;
      TextView gender = ViewBindings.findChildViewById(rootView, id);
      if (gender == null) {
        break missingId;
      }

      id = R.id.guardian;
      RadioButton guardian = ViewBindings.findChildViewById(rootView, id);
      if (guardian == null) {
        break missingId;
      }

      id = R.id.lastName;
      EditText lastName = ViewBindings.findChildViewById(rootView, id);
      if (lastName == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.mother;
      RadioButton mother = ViewBindings.findChildViewById(rootView, id);
      if (mother == null) {
        break missingId;
      }

      id = R.id.nationalityEditTxt;
      EditText nationalityEditTxt = ViewBindings.findChildViewById(rootView, id);
      if (nationalityEditTxt == null) {
        break missingId;
      }

      id = R.id.nationalityTxt;
      TextView nationalityTxt = ViewBindings.findChildViewById(rootView, id);
      if (nationalityTxt == null) {
        break missingId;
      }

      id = R.id.nextButton;
      MaterialButton nextButton = ViewBindings.findChildViewById(rootView, id);
      if (nextButton == null) {
        break missingId;
      }

      id = R.id.other;
      RadioButton other = ViewBindings.findChildViewById(rootView, id);
      if (other == null) {
        break missingId;
      }

      id = R.id.parentFirstName;
      EditText parentFirstName = ViewBindings.findChildViewById(rootView, id);
      if (parentFirstName == null) {
        break missingId;
      }

      id = R.id.parentGuardian;
      TextView parentGuardian = ViewBindings.findChildViewById(rootView, id);
      if (parentGuardian == null) {
        break missingId;
      }

      id = R.id.parentLastName;
      EditText parentLastName = ViewBindings.findChildViewById(rootView, id);
      if (parentLastName == null) {
        break missingId;
      }

      id = R.id.parentNameTxt;
      TextView parentNameTxt = ViewBindings.findChildViewById(rootView, id);
      if (parentNameTxt == null) {
        break missingId;
      }

      id = R.id.permanentAddress;
      TextView permanentAddress = ViewBindings.findChildViewById(rootView, id);
      if (permanentAddress == null) {
        break missingId;
      }

      id = R.id.personalInfoTxt;
      TextView personalInfoTxt = ViewBindings.findChildViewById(rootView, id);
      if (personalInfoTxt == null) {
        break missingId;
      }

      id = R.id.phoneNumberEt;
      EditText phoneNumberEt = ViewBindings.findChildViewById(rootView, id);
      if (phoneNumberEt == null) {
        break missingId;
      }

      id = R.id.phoneNumberTxt;
      TextView phoneNumberTxt = ViewBindings.findChildViewById(rootView, id);
      if (phoneNumberTxt == null) {
        break missingId;
      }

      id = R.id.placeOfBirthEt;
      EditText placeOfBirthEt = ViewBindings.findChildViewById(rootView, id);
      if (placeOfBirthEt == null) {
        break missingId;
      }

      id = R.id.placeOfBirthTxt;
      TextView placeOfBirthTxt = ViewBindings.findChildViewById(rootView, id);
      if (placeOfBirthTxt == null) {
        break missingId;
      }

      id = R.id.radioGroup;
      RadioGroup radioGroup = ViewBindings.findChildViewById(rootView, id);
      if (radioGroup == null) {
        break missingId;
      }

      id = R.id.radioGroup2;
      RadioGroup radioGroup2 = ViewBindings.findChildViewById(rootView, id);
      if (radioGroup2 == null) {
        break missingId;
      }

      id = R.id.scrollable;
      ScrollView scrollable = ViewBindings.findChildViewById(rootView, id);
      if (scrollable == null) {
        break missingId;
      }

      id = R.id.studentNameTxt;
      TextView studentNameTxt = ViewBindings.findChildViewById(rootView, id);
      if (studentNameTxt == null) {
        break missingId;
      }

      id = R.id.topAppBar;
      MaterialToolbar topAppBar = ViewBindings.findChildViewById(rootView, id);
      if (topAppBar == null) {
        break missingId;
      }

      return new ActivityPersonalEnrollmentInfoBinding((ConstraintLayout) rootView, currentAddress,
          currentAddressEt, dateOfBirth, dateOfBirthBtn, dateOfBirthEt, emailAddressEt,
          emailAddressTxt, emergencyContactNumber, emergencyContactNumberEt, father, firstName,
          gender, guardian, lastName, main, mother, nationalityEditTxt, nationalityTxt, nextButton,
          other, parentFirstName, parentGuardian, parentLastName, parentNameTxt, permanentAddress,
          personalInfoTxt, phoneNumberEt, phoneNumberTxt, placeOfBirthEt, placeOfBirthTxt,
          radioGroup, radioGroup2, scrollable, studentNameTxt, topAppBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
