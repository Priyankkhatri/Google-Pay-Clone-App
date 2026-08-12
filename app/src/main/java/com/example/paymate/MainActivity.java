package com.example.paymate;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupTopHeader();
        setupMainActions();
        setupShortcutChips();
        setupPeopleSection();
        setupBillsSection();
        setupBusinessesSection();
        setupCardsAndOffers();
        setupMoneyManagement();
        setupBottomNavigation();
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    private void setupTopHeader() {
        View searchBar = findViewById(R.id.searchBar);
        if (searchBar != null) {
            searchBar.setOnClickListener(v -> showToast("Search clicked - Pay by name or phone"));
        }
        View btnProfile = findViewById(R.id.btnProfile);
        if (btnProfile != null) {
            btnProfile.setOnClickListener(v -> showToast("User Profile clicked"));
        }
        View cardPromo = findViewById(R.id.cardPromo);
        if (cardPromo != null) {
            cardPromo.setOnClickListener(v -> showToast("Promotional Banner clicked - Instant Loan Offer"));
        }
    }

    private void setupMainActions() {
        View btnScanQr = findViewById(R.id.btnScanQr);
        if (btnScanQr != null) {
            btnScanQr.setOnClickListener(v -> showToast("QR Scanner clicked"));
        }
        View btnPayAnyone = findViewById(R.id.btnPayAnyone);
        if (btnPayAnyone != null) {
            btnPayAnyone.setOnClickListener(v -> showToast("Pay anyone clicked"));
        }
        View btnBankTransfer = findViewById(R.id.btnBankTransfer);
        if (btnBankTransfer != null) {
            btnBankTransfer.setOnClickListener(v -> showToast("Bank transfer clicked"));
        }
        View btnMobileRecharge = findViewById(R.id.btnMobileRecharge);
        if (btnMobileRecharge != null) {
            btnMobileRecharge.setOnClickListener(v -> showToast("Mobile recharge clicked"));
        }
    }

    private void setupShortcutChips() {
        View chipUpiLite = findViewById(R.id.chipUpiLite);
        if (chipUpiLite != null) {
            chipUpiLite.setOnClickListener(v -> showToast("UPI Lite clicked"));
        }
        View chipRewards = findViewById(R.id.chipRewards);
        if (chipRewards != null) {
            chipRewards.setOnClickListener(v -> showToast("Rewards chip clicked"));
        }
        View chipUpiId = findViewById(R.id.chipUpiId);
        if (chipUpiId != null) {
            chipUpiId.setOnClickListener(v -> showToast("UPI ID clicked"));
        }
    }

    private void setupPeopleSection() {
        int[] ids = {
            R.id.personPocketMoney, R.id.personSanjay, R.id.personVarsha,
            R.id.personJitendra, R.id.personTamanna, R.id.personTapan,
            R.id.personMahi, R.id.personMore
        };
        String[] names = {
            "Paying to Pocket money", "Paying to Sanjay", "Paying to Varsha Kamlesh",
            "Paying to Jitendra Kumar", "Paying to Tamanna Rajendra", "Paying to Tapan Vipulbhai",
            "Paying to Mahi", "View all contacts clicked"
        };
        for (int i = 0; i < ids.length; i++) {
            View view = findViewById(ids[i]);
            if (view != null) {
                final String msg = names[i];
                view.setOnClickListener(v -> showToast(msg));
            }
        }
    }

    private void setupBillsSection() {
        int[] ids = {
            R.id.btnBillsManage, R.id.billJio, R.id.billMobile, R.id.billDth,
            R.id.billElectricity, R.id.billFastag, R.id.billPostpaid, R.id.billBroadband, R.id.billPlay
        };
        String[] msgs = {
            "Manage Bills clicked", "Jio Prepaid Recharge clicked", "Mobile Recharge clicked", "DTH / Cable TV clicked",
            "Electricity Bill clicked", "FASTag Recharge clicked", "Postpaid Mobile Bill clicked", "Broadband / Landline Bill clicked", "Google Play Recharge clicked"
        };
        for (int i = 0; i < ids.length; i++) {
            View view = findViewById(ids[i]);
            if (view != null) {
                final String msg = msgs[i];
                view.setOnClickListener(v -> showToast(msg));
            }
        }
    }

    private void setupBusinessesSection() {
        int[] ids = { R.id.btnBusinessesExplore, R.id.bizMcDonalds, R.id.bizRoshan, R.id.bizJayanti, R.id.bizMore };
        String[] msgs = { "Explore Businesses clicked", "MC Donalds merchant clicked", "Roshan Lal Sen merchant clicked", "Jayanti So Jiva merchant clicked", "Explore more merchants" };
        for (int i = 0; i < ids.length; i++) {
            View view = findViewById(ids[i]);
            if (view != null) {
                final String msg = msgs[i];
                view.setOnClickListener(v -> showToast(msg));
            }
        }
    }

    private void setupCardsAndOffers() {
        int[] ids = { R.id.cardSubscriptions, R.id.cardGiftCards, R.id.btnOfferRewards, R.id.btnOfferOffers, R.id.btnOfferReferrals };
        String[] msgs = { "Subscriptions clicked", "Gift Cards clicked", "Rewards section clicked", "Offers section clicked", "Referrals section clicked" };
        for (int i = 0; i < ids.length; i++) {
            View view = findViewById(ids[i]);
            if (view != null) {
                final String msg = msgs[i];
                view.setOnClickListener(v -> showToast(msg));
            }
        }
    }

    private void setupMoneyManagement() {
        int[] ids = { R.id.cardPersonalLoan, R.id.cardGoldLoan, R.id.rowCibilScore, R.id.rowTransactionHistory, R.id.rowCheckBalance };
        String[] msgs = { "Personal Loan details clicked", "Gold Loan application clicked", "CIBIL Score clicked", "Transaction history clicked", "Bank balance clicked" };
        for (int i = 0; i < ids.length; i++) {
            View view = findViewById(ids[i]);
            if (view != null) {
                final String msg = msgs[i];
                view.setOnClickListener(v -> showToast(msg));
            }
        }
    }

    private void setupBottomNavigation() {
        View navHome = findViewById(R.id.navHome);
        View navMoney = findViewById(R.id.navMoney);
        View navYou = findViewById(R.id.navYou);

        ImageView iconNavHome = findViewById(R.id.iconNavHome);
        TextView textNavHome = findViewById(R.id.textNavHome);
        ImageView iconNavMoney = findViewById(R.id.iconNavMoney);
        TextView textNavMoney = findViewById(R.id.textNavMoney);
        ImageView iconNavYou = findViewById(R.id.iconNavYou);
        TextView textNavYou = findViewById(R.id.textNavYou);

        if (navHome != null) {
            navHome.setOnClickListener(v -> {
                updateNavColors(iconNavHome, textNavHome, iconNavMoney, textNavMoney, iconNavYou, textNavYou, 1);
                showToast("Home tab selected");
            });
        }
        if (navMoney != null) {
            navMoney.setOnClickListener(v -> {
                updateNavColors(iconNavHome, textNavHome, iconNavMoney, textNavMoney, iconNavYou, textNavYou, 2);
                showToast("Money tab selected");
            });
        }
        if (navYou != null) {
            navYou.setOnClickListener(v -> {
                updateNavColors(iconNavHome, textNavHome, iconNavMoney, textNavMoney, iconNavYou, textNavYou, 3);
                showToast("You tab selected");
            });
        }
    }

    private void updateNavColors(
        ImageView iconHome, TextView textHome,
        ImageView iconMoney, TextView textMoney,
        ImageView iconYou, TextView textYou,
        int selectedTab
    ) {
        int blueColor = ContextCompat.getColor(this, R.color.blue_secondary);
        int greyColor = ContextCompat.getColor(this, R.color.text_secondary);

        if (iconHome != null) iconHome.setColorFilter(greyColor);
        if (textHome != null) textHome.setTextColor(greyColor);
        if (iconMoney != null) iconMoney.setColorFilter(greyColor);
        if (textMoney != null) textMoney.setTextColor(greyColor);
        if (iconYou != null) iconYou.setColorFilter(greyColor);
        if (textYou != null) textYou.setTextColor(greyColor);

        switch (selectedTab) {
            case 1:
                if (iconHome != null) iconHome.setColorFilter(blueColor);
                if (textHome != null) textHome.setTextColor(blueColor);
                break;
            case 2:
                if (iconMoney != null) iconMoney.setColorFilter(blueColor);
                if (textMoney != null) textMoney.setTextColor(blueColor);
                break;
            case 3:
                if (iconYou != null) iconYou.setColorFilter(blueColor);
                if (textYou != null) textYou.setTextColor(blueColor);
                break;
        }
    }
}
