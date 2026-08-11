package com.example.paymate

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

/**
 * MainActivity for PayMate payment dashboard app.
 * Rebuilt to match the reference video design for college project presentation.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize click listeners for top search and main actions
        setupTopHeader()
        setupMainActions()
        setupShortcutChips()

        // Initialize click listeners for grid sections
        setupPeopleSection()
        setupBillsSection()
        setupBusinessesSection()

        // Initialize cards, offers & money management
        setupCardsAndOffers()
        setupMoneyManagement()

        // Initialize bottom navigation
        setupBottomNavigation()
    }

    // Helper method to show Toast messages
    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    // 1. Top Search Bar and Profile
    private fun setupTopHeader() {
        findViewById<View>(R.id.searchBar)?.setOnClickListener {
            showToast("Search clicked - Pay by name or phone")
        }
        findViewById<View>(R.id.btnProfile)?.setOnClickListener {
            showToast("User Profile clicked")
        }
        findViewById<View>(R.id.cardPromo)?.setOnClickListener {
            showToast("Promotional Banner clicked - Instant Loan Offer")
        }
    }

    // 2. Four Main Payment Actions
    private fun setupMainActions() {
        findViewById<View>(R.id.btnScanQr)?.setOnClickListener {
            showToast("QR Scanner clicked")
        }
        findViewById<View>(R.id.btnPayAnyone)?.setOnClickListener {
            showToast("Pay anyone clicked")
        }
        findViewById<View>(R.id.btnBankTransfer)?.setOnClickListener {
            showToast("Bank transfer clicked")
        }
        findViewById<View>(R.id.btnMobileRecharge)?.setOnClickListener {
            showToast("Mobile recharge clicked")
        }
    }

    // 3. Horizontal Shortcut Chips
    private fun setupShortcutChips() {
        findViewById<View>(R.id.chipUpiLite)?.setOnClickListener {
            showToast("UPI Lite clicked")
        }
        findViewById<View>(R.id.chipRewards)?.setOnClickListener {
            showToast("Rewards chip clicked")
        }
        findViewById<View>(R.id.chipUpiId)?.setOnClickListener {
            showToast("UPI ID clicked")
        }
    }

    // 4. People Section
    private fun setupPeopleSection() {
        findViewById<View>(R.id.personPocketMoney)?.setOnClickListener {
            showToast("Paying to Pocket money")
        }
        findViewById<View>(R.id.personSanjay)?.setOnClickListener {
            showToast("Paying to Sanjay")
        }
        findViewById<View>(R.id.personVarsha)?.setOnClickListener {
            showToast("Paying to Varsha Kamlesh")
        }
        findViewById<View>(R.id.personJitendra)?.setOnClickListener {
            showToast("Paying to Jitendra Kumar")
        }
        findViewById<View>(R.id.personTamanna)?.setOnClickListener {
            showToast("Paying to Tamanna Rajendra")
        }
        findViewById<View>(R.id.personTapan)?.setOnClickListener {
            showToast("Paying to Tapan Vipulbhai")
        }
        findViewById<View>(R.id.personMahi)?.setOnClickListener {
            showToast("Paying to Mahi")
        }
        findViewById<View>(R.id.personMore)?.setOnClickListener {
            showToast("View all contacts clicked")
        }
    }

    // 5. Bills & Recharges Section
    private fun setupBillsSection() {
        findViewById<View>(R.id.btnBillsManage)?.setOnClickListener {
            showToast("Manage Bills clicked")
        }
        findViewById<View>(R.id.billJio)?.setOnClickListener {
            showToast("Jio Prepaid Recharge clicked")
        }
        findViewById<View>(R.id.billMobile)?.setOnClickListener {
            showToast("Mobile Recharge clicked")
        }
        findViewById<View>(R.id.billDth)?.setOnClickListener {
            showToast("DTH / Cable TV clicked")
        }
        findViewById<View>(R.id.billElectricity)?.setOnClickListener {
            showToast("Electricity Bill clicked")
        }
        findViewById<View>(R.id.billFastag)?.setOnClickListener {
            showToast("FASTag Recharge clicked")
        }
        findViewById<View>(R.id.billPostpaid)?.setOnClickListener {
            showToast("Postpaid Mobile Bill clicked")
        }
        findViewById<View>(R.id.billBroadband)?.setOnClickListener {
            showToast("Broadband / Landline Bill clicked")
        }
        findViewById<View>(R.id.billPlay)?.setOnClickListener {
            showToast("Google Play Recharge clicked")
        }
    }

    // 6. Businesses Section
    private fun setupBusinessesSection() {
        findViewById<View>(R.id.btnBusinessesExplore)?.setOnClickListener {
            showToast("Explore Businesses clicked")
        }
        findViewById<View>(R.id.bizMcDonalds)?.setOnClickListener {
            showToast("MC Donalds merchant clicked")
        }
        findViewById<View>(R.id.bizRoshan)?.setOnClickListener {
            showToast("Roshan Lal Sen merchant clicked")
        }
        findViewById<View>(R.id.bizJayanti)?.setOnClickListener {
            showToast("Jayanti So Jiva merchant clicked")
        }
        findViewById<View>(R.id.bizMore)?.setOnClickListener {
            showToast("Explore more merchants")
        }
    }

    // 7. Gift Cards, Subscriptions & Offers
    private fun setupCardsAndOffers() {
        findViewById<View>(R.id.cardSubscriptions)?.setOnClickListener {
            showToast("Subscriptions clicked")
        }
        findViewById<View>(R.id.cardGiftCards)?.setOnClickListener {
            showToast("Gift Cards clicked")
        }
        findViewById<View>(R.id.btnOfferRewards)?.setOnClickListener {
            showToast("Rewards section clicked")
        }
        findViewById<View>(R.id.btnOfferOffers)?.setOnClickListener {
            showToast("Offers section clicked")
        }
        findViewById<View>(R.id.btnOfferReferrals)?.setOnClickListener {
            showToast("Referrals section clicked")
        }
    }

    // 8. Manage Your Money Section & Clickable Rows
    private fun setupMoneyManagement() {
        findViewById<View>(R.id.cardPersonalLoan)?.setOnClickListener {
            showToast("Personal Loan details clicked")
        }
        findViewById<View>(R.id.cardGoldLoan)?.setOnClickListener {
            showToast("Gold Loan application clicked")
        }
        findViewById<View>(R.id.rowCibilScore)?.setOnClickListener {
            showToast("CIBIL Score clicked")
        }
        findViewById<View>(R.id.rowTransactionHistory)?.setOnClickListener {
            showToast("Transaction history clicked")
        }
        findViewById<View>(R.id.rowCheckBalance)?.setOnClickListener {
            showToast("Bank balance clicked")
        }
    }

    // 9. Bottom Navigation Bar Handling
    private fun setupBottomNavigation() {
        val navHome = findViewById<View>(R.id.navHome)
        val navMoney = findViewById<View>(R.id.navMoney)
        val navYou = findViewById<View>(R.id.navYou)

        val iconNavHome = findViewById<ImageView>(R.id.iconNavHome)
        val textNavHome = findViewById<TextView>(R.id.textNavHome)
        val iconNavMoney = findViewById<ImageView>(R.id.iconNavMoney)
        val textNavMoney = findViewById<TextView>(R.id.textNavMoney)
        val iconNavYou = findViewById<ImageView>(R.id.iconNavYou)
        val textNavYou = findViewById<TextView>(R.id.textNavYou)

        navHome?.setOnClickListener {
            updateNavColors(iconNavHome, textNavHome, iconNavMoney, textNavMoney, iconNavYou, textNavYou, 1)
            showToast("Home tab selected")
        }

        navMoney?.setOnClickListener {
            updateNavColors(iconNavHome, textNavHome, iconNavMoney, textNavMoney, iconNavYou, textNavYou, 2)
            showToast("Money tab selected")
        }

        navYou?.setOnClickListener {
            updateNavColors(iconNavHome, textNavHome, iconNavMoney, textNavMoney, iconNavYou, textNavYou, 3)
            showToast("You tab selected")
        }
    }

    // Updates navigation bar colors depending on selected tab index
    private fun updateNavColors(
        iconHome: ImageView?, textHome: TextView?,
        iconMoney: ImageView?, textMoney: TextView?,
        iconYou: ImageView?, textYou: TextView?,
        selectedTab: Int
    ) {
        val blueColor = ContextCompat.getColor(this, R.color.blue_secondary)
        val greyColor = ContextCompat.getColor(this, R.color.text_secondary)

        // Reset all
        iconHome?.setColorFilter(greyColor)
        textHome?.setTextColor(greyColor)
        iconMoney?.setColorFilter(greyColor)
        textMoney?.setTextColor(greyColor)
        iconYou?.setColorFilter(greyColor)
        textYou?.setTextColor(greyColor)

        // Highlight selected
        when (selectedTab) {
            1 -> {
                iconHome?.setColorFilter(blueColor)
                textHome?.setTextColor(blueColor)
            }
            2 -> {
                iconMoney?.setColorFilter(blueColor)
                textMoney?.setTextColor(blueColor)
            }
            3 -> {
                iconYou?.setColorFilter(blueColor)
                textYou?.setTextColor(blueColor)
            }
        }
    }
}
